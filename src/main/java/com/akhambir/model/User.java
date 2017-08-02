package com.akhambir.model;

import org.springframework.data.jpa.repository.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name="email", nullable=false)
    private String email;

    @Column(name="password", nullable=false)
    private String password;

    @Column(name="user_name", nullable=false, unique=true)
    private String userName;

    @OneToMany(mappedBy="users", fetch=FetchType.EAGER)
    private List<Task> tasks;

    @OneToMany(mappedBy="users", fetch=FetchType.EAGER)
    private List<Comment> comments;

    public User() {}

    public User(String email, String password, String userName, List<Task> tasks, List<Comment> comments) {
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.tasks = tasks;
        this.comments = comments;
    }
}
