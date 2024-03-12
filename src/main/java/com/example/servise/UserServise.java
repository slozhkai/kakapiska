package com.example.servise;

import com.example.demo.User;
import com.example.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServise {
    @Autowired
    private UserRepository userRepository;
    public List<User> listAllUser() {
        return userRepository.findAll();
    }

    public void saveUser (User user) {
        userRepository.save(user);
    }

    public User getUser(Integer id_user) {
        return userRepository.findById(id_user).get();
    }

    public void deleteUser(Integer id_user) {
        userRepository.deleteById(id_user);
    }
}
