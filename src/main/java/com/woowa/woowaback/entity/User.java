package com.woowa.woowaback.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Builder
@Entity
@Table(name="user")
@NoArgsConstructor
public class User {
    @Id @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    public User(Long id, String name){
        this.id = id;
        this.name = name;
    }
}
