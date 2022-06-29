package ar.com.onwave.service.impl;

import ar.com.onwave.repository.UserRepository;
import ar.com.onwave.repository.model.UserModel;
import ar.com.onwave.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserModel> getUsers() {
        return userRepository.findAllUsers();
    }

    @Override
    public List<UserModel> getUser(Long idUsuario) {
        return userRepository.findUser(idUsuario);
    }

    @Override
    public void addUser(UserModel userModel) {
        userRepository.createUser(userModel);
    }

    @Override
    public void modifyUser(UserModel userModel, Long idUsuario) {
        userRepository.updateUser(userModel, idUsuario);
    }

    @Override
    public void removeUser(Long idUsuario) {
        userRepository.deleteUser(idUsuario);
    }
}
