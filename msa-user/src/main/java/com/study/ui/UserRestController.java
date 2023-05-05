package com.study.ui;
import com.study.application.UserService;
import com.study.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {
    private final UserService userService;

    public UserRestController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users")
    public ResponseEntity<List<User>> list() {
        return ResponseEntity.ok().body(userService.list());
    }

}