package ar.com.onwave.repository;

import ar.com.onwave.repository.model.UserModel;

import java.util.List;

public interface UserRepository {
    List<UserModel> findAllUsers();
}
