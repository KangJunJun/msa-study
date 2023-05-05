package com.study.application;


import com.study.domain.User;
import com.study.domain.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /** TODO : create user
    @Transactional
    public User create(final UserRequest userRequest) {
        return userRepository.save(userRequest.toUser());
    }
     **/

    public List<User> list() {
        return userRepository.findAll();
    }

}