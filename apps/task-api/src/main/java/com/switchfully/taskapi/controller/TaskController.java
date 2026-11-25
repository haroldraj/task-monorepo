package com.switchfully.taskapi.controller;

import com.switchfully.taskapi.TasksApi;
import com.switchfully.taskapi.model.TaskDTO;
import com.switchfully.taskapi.model.TaskInputDTO;
import com.switchfully.taskapi.model.TaskPageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "hhtp://localhost:4200")
public class TaskController implements TasksApi {
public void test() {
}

    @Override
    public ResponseEntity<TaskDTO> createTask(TaskInputDTO taskInputDTO) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteTask(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<TaskDTO> getTask(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<TaskPageDTO> listTasks(Integer page, Integer size) {
        return null;
    }

    @Override
    public ResponseEntity<TaskDTO> updateTask(Long id, TaskInputDTO taskInputDTO) {
        return null;
    }
//    @GetMapping
//    public List<TaskDto> getTasks() {
//        return List.of();
//    }

//    @PostMapping
//    public TaskDto addTask(@RequestBody TaskDto task) {
//        TaskDto created = new TaskDto((long)(tasks.size() + 1), task.title(), task.completed());
//        tasks.add(created);
//        return created;
//    }
}
