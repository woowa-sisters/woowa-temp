package com.woowa.woowaback.controller;

import com.woowa.woowaback.entity.User;
//import com.woowa.woowaback.service.UserService;
import com.woowa.woowaback.service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user/test")
    public String userTest(){
        return "Hello User!";
    }

//    @PostMapping("/user")
//    public User postUser(User user){
//        // 애플리케이션 로딩 시점에 딱 하나만 만들어져야 함
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//
//        // 일괄적인 연결, 통신, 종료 행위 마다 생성 -> connection
//        EntityManager em = emf.createEntityManager();
//
//        // 트랜잭션 얻기
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        try{
//            em.persist(user);
//            tx.commit();
//        } catch (Exception e){
//            tx.rollback();
//        } finally {
//            em.close();
//        }
//        emf.close();
//
//        // return 객체 수정 요함
//        return user;
//    }

    @GetMapping("/user")
    public List<User> getUser(){
        return userService.getUser();
    }

//    @GetMapping("/user")
//    public String getUser(){
//        return "Hello User!";
//    }

}
