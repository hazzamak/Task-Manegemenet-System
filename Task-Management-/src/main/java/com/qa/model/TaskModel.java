package com.qa.model;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class TaskModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long taskid;

	@Column(name = "taskname")
	private String taskname;

	@Column(name = "taskdesc")
	private String taskdesc;

	@Column(name = "taskdone")
	private boolean taskdone;

	public TaskModel() {

	}

	public TaskModel(String taskname, String taskdesc, boolean taskdone) {
		this.taskname = taskname;
		this.taskdesc = taskdesc;
		this.taskdone = taskdone;
	}

	public long getId() {
		return taskid;
	}

	public String gettaskname() {
		return taskname;
	}

	public void settaskname(String taskname) {
		this.taskname = taskname;
	}

	public String gettaskdesc() {
		return taskdesc;
	}

	public void settaskdesc(String taskdesc) {
		this.taskdesc = taskdesc;
	}

	public boolean istaskdone() {
		return taskdone;
	}

	public void settaskdone(boolean taskdone) {
		this.taskdone = taskdone;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + taskid + ", taskname=" + 
	taskname + ", desc=" + taskdesc + ", taskdone=" + taskdone + "]";
	}
}

