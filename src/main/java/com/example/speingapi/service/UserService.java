package com.example.speingapi.service;

import com.example.speingapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Sukuna", 1000, "tutureitadori@gmail.com");
        User user2 = new User(2, "Gojo-Over", 28, "gotdefeatedbysukunakaisen@gmail.com");
        User user3 = new User(3, "Deku", 18, "currentlydisable@gmail.com");
        User user4 = new User(4, "Asta", 18, "astapasta@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList){
            if (id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

    public List<User> getAllUsers() {
        return userList;
    }

}
