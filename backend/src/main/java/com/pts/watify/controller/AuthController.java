package com.pts.watify.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/redirectedFromBank")
    public void redirectFromBank(@RequestParam("accessToken") String accessToken) {
        System.out.println(accessToken);
    }
}
