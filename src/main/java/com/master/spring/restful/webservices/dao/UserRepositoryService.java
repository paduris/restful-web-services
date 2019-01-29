package com.master.spring.restful.webservices.dao;

import com.master.spring.restful.webservices.Exception.UserNotFoundException;
import com.master.spring.restful.webservices.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Created by paduris on 12/16/18.
 * <p>
 * A simple User Repository service for user CRUD operations
 */

@Component
public class UserRepositoryService {


    @Autowired
    private UserRepository userRepository;

    /**
     * Find All users
     *
     * @return
     */
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * Save User
     *
     * @param user
     * @return
     */
    public User save(User user) {

        return userRepository.save(user);
    }


    /**
     * Find User by user Id
     *
     * @param userId
     * @return
     * @throws Exception
     */
    public User findUser(Integer userId) throws UserNotFoundException {

        Optional<User> user = userRepository
                .findById(userId);

        if (!user.isPresent()) {
            throw new UserNotFoundException("User Not Found");
        }
        return user.get();
    }


    /**
     * Delete user by user id
     *
     * @param
     */

    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}
