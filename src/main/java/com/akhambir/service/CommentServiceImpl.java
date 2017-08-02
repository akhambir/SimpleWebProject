package com.akhambir.service;

import com.akhambir.DAO.interfaces.CommentDAO;
import com.akhambir.model.Comment;
import com.akhambir.service.interfaces.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommentServiceImpl.class);

    @Autowired
    private CommentDAO commentDAO;

    @Override
    public void addComment(Comment comment) {
        LOGGER.debug("CommentServiceImpl: addComment is called");
        commentDAO.save(comment);
    }
}
