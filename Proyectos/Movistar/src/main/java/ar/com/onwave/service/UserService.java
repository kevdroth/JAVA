package ar.com.onwave.service;

import ar.com.onwave.repository.model.PlanModel;
import ar.com.onwave.repository.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> getUsers();
    List<UserModel> getUser(Long idUsuario);
    void addUser(UserModel userModel);
    void modifyUser(UserModel userModel, Long idUsuario);
    void removeUser(Long idUsuario);
}
