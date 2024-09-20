package com.test2.service;

import com.test2.repository.UserRepository;
import com.test2.user.User;

public class UserService {
    UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(String name, int coins) {
        if(coins<=0) throw  new RuntimeException("Coin should be greater than 0");
        return userRepository.createUser(name, coins);
    }

    public void showBalance(){
        userRepository.showBalance();
    }
}
