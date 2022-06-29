package ar.com.onwave.repository;

import ar.com.onwave.repository.model.EquipmentModel;
import ar.com.onwave.repository.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {
    List<UserModel> findAllUsers();
    List<UserModel> findUser(Long idUsuario);
    void createUser(UserModel userModel);
    void deleteUser(Long idUsuario);
    void updateUser(UserModel userModel, Long idUsuario);
}
