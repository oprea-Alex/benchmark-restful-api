package ro.mta.BenchmarkRestfulApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import ro.mta.BenchmarkRestfulApi.entity.UserEntity;
import ro.mta.BenchmarkRestfulApi.repository.UserRepository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository mUserRepository;


    public List<UserEntity> getAllUsers() {
        return mUserRepository.findAll();
    }

    public UserEntity getUserByUsername(final String username) {
        return mUserRepository.findById(username).get();
    }

/*    public List<UserEntity> getAllUsersAfterTimestamp( final Timestamp timestamp) {
        List<UserEntity> allUsers = mUserRepository.findAll();
        ArrayList<UserEntity> userEntities = new ArrayList<>();
        for (UserEntity u :
                allUsers) {
            if (u.getAddedAt().after(timestamp))
                userEntities.add(u);
        }
        return userEntities;
    }*/

    public void registerUser(final UserEntity user) {
        mUserRepository.save(user);
    }

    public void updateUserProfile(final UserEntity user) {
        UserEntity u = mUserRepository.getOne(user.getUsername());
        u.setEmail(user.getEmail());
        u.setName(user.getName());
        u.setPassword(user.getPassword());
        mUserRepository.save(u);
    }

}
