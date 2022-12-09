package com.h2.firstapih2.service;

import com.h2.firstapih2.model.User;
import com.h2.firstapih2.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //pq esta clase implementa los metodos, la otra solo llama a los metodos, esta clase es mi servicio
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public User modifyUser(Long id, User userToModify) {
        User userSearched = userRepository.findById(id).get();
        userSearched.setAddress(userToModify.getAddress());
        userSearched.setPhoneNumber(userToModify.getPhoneNumber());
        return userRepository.save(userSearched);
    }

    @Override
    public boolean deleteUser(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
