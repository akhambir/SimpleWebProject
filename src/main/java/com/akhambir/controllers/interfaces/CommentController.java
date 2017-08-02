package com.akhambir.controllers.interfaces;

import com.akhambir.model.Comment;
import com.akhambir.service.interfaces.CommentService;
import com.akhambir.service.interfaces.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CommentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommentController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private CommentService commentService;

    public void addComment(String commentBody) {

        LOGGER.debug("CommentController: addComment is called");

        Comment comment = new Comment();
        comment.setCommentBody(commentBody);
        //comment.setUser();

        commentService.addComment(comment);

    }
}