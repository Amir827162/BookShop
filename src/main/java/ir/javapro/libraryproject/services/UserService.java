package ir.javapro.libraryproject.services;

import ir.javapro.libraryproject.dto.request.UserRequest;
import ir.javapro.libraryproject.dto.response.UserResponse;

public interface UserService {
    UserResponse save(UserRequest userRequest);
}
