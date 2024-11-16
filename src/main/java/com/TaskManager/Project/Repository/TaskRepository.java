package com.TaskManager.Project.Repository;

import com.TaskManager.Project.Entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

//import java.sql.Date;
import java.util.Date;
import java.util.List;


public interface TaskRepository extends MongoRepository<Task, String> {
    List<Task> findByPriority(String priority);

}
