package com.example.demo.service;

import com.example.demo.model.Task;

import java.util.List;

public interface TaskService {
    public List<Task> getAllTask();
    public void deleteTask(Long id);
    public Task updateTask(Long id, Task taskDetails);
    public Task createTask(Task task);
    public Task getTaskById(Long id);
}
