package ir.javapro.libraryproject.services;

import ir.javapro.libraryproject.Exception.RuleException;
import ir.javapro.libraryproject.dto.request.UserRequest;
import ir.javapro.libraryproject.dto.response.UserResponse;
import ir.javapro.libraryproject.model.User;
import ir.javapro.libraryproject.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse save(UserRequest userRequest) {
        Optional<User> byUsername = userRepository.findByUsername(userRequest.getUsername());
        if (byUsername.isPresent()) {
            throw new RuleException("Username.already.exists");
        }
        return createUserResponse(userRepository.save(createUserRequest(userRequest)));
    }

    private UserResponse createUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .build();
    }

    private User createUserRequest(UserRequest userRequest) {
        return User.builder()
                .username(userRequest.getUsername())
                .password(userRequest.getPassword())
                .build();
    }
}
