package com.service.reactive.users;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public Flux<UserData> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{user_id}")
    public Mono<UserData> getUserById(@PathVariable("user_id") Long userId) {
        return userRepository.findById(userId);
    }

    @PostMapping
    public Mono<UserData> getUserById(@RequestBody UserData userData) {
        return userRepository.save(userData);
    }

    @DeleteMapping("/{user_id}")
    public Mono<Void> deleteUserById(@PathVariable("user_id") Long userId) {
        return userRepository.deleteById(userId);
    }
}
