package com.master.spring.restful.webservices.controller;

import com.master.spring.restful.webservices.Exception.UserNotFoundException;
import com.master.spring.restful.webservices.dao.UserRepositoryService;
import com.master.spring.restful.webservices.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

/**
 * Created by paduris on 12/16/18.
 */

@RestController
public class UserController {


    @Autowired
    private UserRepositoryService service;


    /**
     * Find All Users
     *
     * @return
     */
    @GetMapping(path = "/users")
    public List<User> findAllUsers() {
        return service.findAll();
    }

    /**
     * Create User
     *
     * @param user
     * @return
     */
    @PostMapping(path = "/users")
    public ResponseEntity<User> create(@Valid @RequestBody User user) {

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }


    /**
     * find User
     *
     * @param id
     * @return
     */
    @GetMapping(path = "/users/{id}")
    public Resource<User> findUser(@PathVariable int id) {
        User user = null;
        try {
            user = service.findUser(id);
        } catch (UserNotFoundException ex) {
            throw new UserNotFoundException("User Not Found for id ::" + id);
        }
        // HATEOAS Scenario - https://restfulapi.net/hateoas/
        // , helps to pass links in responses
        Resource<User> resource = new Resource<>(user);
        ControllerLinkBuilder linkTo = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).findAllUsers());
        resource.add(linkTo.withRel("all-users"));
        return resource;
    }


    /**
     * Delete user
     *
     * @param id
     */
    @GetMapping(path = "/users/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        service.deleteUser(id);
    }
}