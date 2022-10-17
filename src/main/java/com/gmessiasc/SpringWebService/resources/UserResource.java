package com.gmessiasc.SpringWebService.resources;

import com.gmessiasc.SpringWebService.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "(99)99999-9999", "1235467" );
        return ResponseEntity.ok().body(u);
    }
}