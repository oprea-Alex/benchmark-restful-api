package ro.mta.BenchmarkRestfulApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import ro.mta.BenchmarkRestfulApi.entity.UserEntity;
import ro.mta.BenchmarkRestfulApi.service.UserService;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService mUserService;

    @RequestMapping("/")
    public String index() {
        return "Congratulations from UserController.java";
    }

    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers() {
        return (List<UserEntity>) mUserService.getAllUsers();
    }

    @GetMapping("/getUserByUsername/{username}")
    public UserEntity getUserByUsername(@PathVariable final String username) {
        return mUserService.getUserByUsername(username);
    }

/*    @GetMapping("/getAllUsersAfterTimestamp/{timestamp}")
    public List<UserEntity> getAllUsersAfterTimestamp(@PathVariable final Timestamp timestamp) {
        return mUserService.getAllUsersAfterTimestamp(timestamp);
    }*/

    @PostMapping("/registerUser")
    public void registerUser(@RequestBody final UserEntity user) {
        mUserService.registerUser(user);
    }

    @PutMapping("/updateUserProfile")
    public void updateUserProfile(@RequestBody final UserEntity user) {
        mUserService.updateUserProfile(user);
    }

}
