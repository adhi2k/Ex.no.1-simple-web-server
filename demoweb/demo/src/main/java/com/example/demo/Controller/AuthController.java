package com.example.demo.Controller;

import com.example.demo.LoginRequest;
import com.example.demo.Security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest req) {

        if ("admin".equals(req.getUsername())
                && "1234".equals(req.getPassword())) {

            return JwtUtil.generateToken(req.getUsername());
        }

        return "Invalid Credentials";
    }



    @GetMapping("/hello")
    public String hello() {
        return "Hello JWT Secure API";
    }
}