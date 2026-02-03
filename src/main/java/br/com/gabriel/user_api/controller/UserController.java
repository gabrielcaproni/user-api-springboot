package br.com.gabriel.user_api.controller;

import br.com.gabriel.user_api.entity.User;
import br.com.gabriel.user_api.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return service.save(user);
    }
}
