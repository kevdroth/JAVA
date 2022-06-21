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
}
