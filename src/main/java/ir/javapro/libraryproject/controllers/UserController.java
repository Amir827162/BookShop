package ir.javapro.libraryproject.controllers;

import ir.javapro.libraryproject.dto.request.UserRequest;
import ir.javapro.libraryproject.dto.response.UserResponse;
import ir.javapro.libraryproject.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> addUser(@RequestBody @Valid UserRequest userRequest) {
        return ResponseEntity.ok(userService.save(userRequest));
    }
}
