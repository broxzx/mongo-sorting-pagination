package ua.project.mongosortingpagination.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ua.project.mongosortingpagination.entity.UserEntity;
import ua.project.mongosortingpagination.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public Page<UserEntity> users(Pageable pageable) {
        return userService.findAllUsers(pageable);
    }

    @PatchMapping
    public List<UserEntity> users(@RequestParam(defaultValue = "_id", value = "by") String sortParam) {
        return userService.findUsersBy(sortParam);
    }
}
