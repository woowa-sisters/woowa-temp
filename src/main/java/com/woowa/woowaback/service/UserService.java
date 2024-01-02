//package com.woowa.woowaback.service;
//
//import com.woowa.woowaback.dto.UserDTO;
//import com.woowa.woowaback.entity.User;
//import com.woowa.woowaback.repository.UserRepository;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@Service
//public class UserService {
//    private final UserRepository userRepository;
//
//    @Transactional
//    public User postUser(UserDTO dto){
//        User user = dto.toEntity(dto.getName());
//
//        return userRepository.save(user);
//    }
//
//    public List<User> getUser(){
//        return userRepository.findAll();
//    }
//}
