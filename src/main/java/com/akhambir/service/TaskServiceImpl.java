package com.akhambir.service;

import com.akhambir.DAO.interfaces.TaskDAO;
import com.akhambir.model.Task;
import com.akhambir.service.interfaces.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskServiceImpl.class);

    @Autowired
    private TaskDAO taskDAO;

    @Override
    public void addTask(Task task) {
        LOGGER.debug("TaskServiceImpl: addTask is called");
        taskDAO.save(task);
    }
}
