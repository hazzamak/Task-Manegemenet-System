CREATE TABLE tasks (
	taskid INT UNIQUE,
    taskname VARCHAR(200),
    taskdesc VARCHAR(200),
    taskdone BOOLEAN NOT NULL
);
    
    