package ar.com.onwave.controller;

import ar.com.onwave.repository.model.UserModel;
import ar.com.onwave.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public List<UserModel> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/get/{id_usuario}")
    public List<UserModel> getUser(Long idUsuario) {
        return userService.getUser(idUsuario);
    }

    @PostMapping("/add")
    public void addUser(UserModel userModel) {
        userService.addUser(userModel);
    }

    @PostMapping("/update/{id_usuario}")
    public void modifyUser(UserModel userModel, Long idUsuario) {
        userService.modifyUser(userModel, idUsuario);
    }

    @GetMapping("/remove/{id_usuario}")
    public void removeUser(Long idUsuario) {
        userService.removeUser(idUsuario);
    }
}
