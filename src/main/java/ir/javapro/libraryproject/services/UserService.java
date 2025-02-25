package ir.javapro.libraryproject.services;

import ir.javapro.libraryproject.dto.request.UserRequest;
import ir.javapro.libraryproject.dto.response.UserResponse;
import ir.javapro.libraryproject.model.User;

public interface UserService {
    UserResponse save(UserRequest userRequest);
}
