package com.todoapp.List.Services;

import com.todoapp.List.Models.Task;
import com.todoapp.List.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createNewTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }

    public Task findTaskById(Long id){
        return taskRepository.getById(id);
    }

    public List<Task> findAllCompletedTask(){
        return taskRepository.findByCompletedTrue();
    }

    public List<Task> findAllInCompletedTask(){
        return taskRepository.findByCompletedFalse();
    }

    public void deleteTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
        taskRepository.delete(task);
    }


    public Task updateTask(Task task){
        return taskRepository.save(task);
    }
}
