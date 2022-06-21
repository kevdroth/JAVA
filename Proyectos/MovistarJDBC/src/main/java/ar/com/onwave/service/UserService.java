package ar.com.onwave.service;

import ar.com.onwave.repository.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> getUsers();
}
