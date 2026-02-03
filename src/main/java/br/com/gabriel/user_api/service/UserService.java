package br.com.gabriel.user_api.service;

import br.com.gabriel.user_api.entity.User;
import br.com.gabriel.user_api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(User user){
        return repository.save(user);
    }
}
