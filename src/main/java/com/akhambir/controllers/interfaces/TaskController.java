package com.akhambir.controllers.interfaces;

import com.akhambir.model.Task;
import com.akhambir.service.interfaces.TaskService;
import com.akhambir.service.interfaces.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TaskController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private TaskService taskService;

    private UserService userService; // TODO where is better to do? here or on service layer?

    public void addTask(String taskBody, String userName) {
        LOGGER.debug("TaskController: addTask is called");

        Task task = new Task();
        task.setTaskBody(taskBody);
        task.setUser(userService.findUserByName(userName));
        taskService.addTask(task);
    }

    public Task findByUserNameAndTaskName(String userName, String taskName) {

        // TODO first you need understand how it works...

        return null;
    }

}
