package com.qa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task-management-schema")
public class TaskModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "taskid")
	Integer taskID;
	
	@Column(name = "taskname")
	String taskName;
	
	@Column(name = "taskdesc")
	String taskDesc;
	
	@Column(name = "taskdone")
	Boolean taskDone;

}
