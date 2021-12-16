package com.qa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.model.TaskModel;


public interface taskRespository extends JpaRepository<TaskModel, Long> {
  List<TaskModel> findByTaskDone(boolean taskdone);
  List<TaskModel> findByTaskName(String taskname);
}
