package com.akhambir.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name="task_name", nullable=false, unique=true)
    private String taskName;

    @Column(name="task_body", nullable=false)
    private String taskBody;

    @Column(name="grade")
    private Integer grade;  // maybe better something like enum???

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)    // TODO Maybe better change to ManyToMany..
    private User user;

    @OneToMany(mappedBy="tasks", fetch=FetchType.EAGER)
    private List<Comment> comments;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskBody() {
        return taskBody;
    }

    public void setTaskBody(String taskBody) {
        this.taskBody = taskBody;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
