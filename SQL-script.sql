CREATE TABLE tasks (
	taskid INT UNIQUE NOT NULL AUTO_INCREMENT,
    taskname VARCHAR(200),
    taskdesc VARCHAR(200),
    taskdone BOOLEAN NOT NULL
);

INSERT INTO tasks (taskid, taskname, taskdesc, taskdone) VALUES (2, "test name 2", "test description 2", false);
    
SELECT * FROM tasks;