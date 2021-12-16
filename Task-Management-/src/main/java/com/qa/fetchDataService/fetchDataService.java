package com.qa.fetchDataService;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.map.repository.config.taskRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.qa.model.TaskModel;

@Service
@EnableJpaRepositories
public class fetchDataService {
  private final CrudRepository<TaskModel, Long> repository;

  public fetchDataService(CrudRepository<TaskModel, Long> repository) {
    this.repository = repository;
  }
}
