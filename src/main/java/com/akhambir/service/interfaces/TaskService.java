package com.akhambir.service.interfaces;

import com.akhambir.model.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
    void addTask(Task task);
}
