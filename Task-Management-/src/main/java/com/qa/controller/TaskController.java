package com.qa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qa.model.TaskModel;
import com.qa.repository.taskRespository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class TaskController {

  @Autowired
  taskRespository taskrepo;

  @GetMapping("/tasks")
  public ResponseEntity<List<TaskModel>> getAllTasks(@RequestParam(required = false) String taskname) {
    try {
      List<TaskModel> tasks = new ArrayList<TaskModel>();

      if (taskname == null)
        taskrepo.findAll().forEach(tasks::add);
      else
        taskrepo.findByTaskName(taskname).forEach(tasks::add);

      if (tasks.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(tasks, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/tasks/{taskid}")
  public ResponseEntity<TaskModel> getTaskByID(@PathVariable("taskid") long taskid) {
    Optional<TaskModel> taskData = taskrepo.findById(taskid);

    if (taskData.isPresent()) {
      return new ResponseEntity<>(taskData.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/tasks")
  public ResponseEntity<TaskModel> createTutorial(@RequestBody TaskModel taskmodel) {
    try {
      TaskModel task = taskrepo
          .save(new TaskModel(taskmodel.gettaskname(), taskmodel.gettaskdesc(), false));
      return new ResponseEntity<>(task, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PutMapping("/tasks/{taskid}")
  public ResponseEntity<TaskModel> updateTutorial(@PathVariable("id") long id, @RequestBody TaskModel taskmodel) {
    Optional<TaskModel> taskData = taskrepo.findById(id);

    if (taskData.isPresent()) {
      TaskModel task = taskData.get();
      task.settaskname(task.gettaskname());
      task.settaskdesc(task.gettaskdesc());
      task.settaskdone(task.istaskdone());
      return new ResponseEntity<>(taskrepo.save(task), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/tasks/{taskid}")
  public ResponseEntity<HttpStatus> deleteTask(@PathVariable("taskid") long taskid) {
    try {
      taskrepo.deleteById(taskid);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @DeleteMapping("/tasks")
  public ResponseEntity<HttpStatus> deleteAllTasks() {
    try {
      taskrepo.deleteAll();
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  @GetMapping("/tasks/published")
  public ResponseEntity<List<TaskModel>> findByTaskDone() {
    try {
      List<TaskModel> tasks = taskrepo.findByTaskDone(true);

      if (tasks.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(tasks, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

}
