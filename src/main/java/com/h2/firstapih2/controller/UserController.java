package com.h2.firstapih2.controller;

import com.h2.firstapih2.model.User;
import com.h2.firstapih2.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //le dice a spring boot que esta clase es la que va a manejar el controlador
@RequestMapping("/users") //indica la ruta para accceder al controllador
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping //Crear
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}") //Obtener
    public User getUser(@PathVariable("id") Long idUser){
        return userService.getUser(idUser);
    }

    @PutMapping("/{id}") //Modificar
    public User modifyUser(@PathVariable("id") Long idUser, @RequestBody User user){
        return userService.modifyUser(idUser, user);
    }

    @DeleteMapping("{id}") //Eliminar
    public boolean deleteUser(@PathVariable("id") Long idUser){
        return userService.deleteUser(idUser);
    }
}
