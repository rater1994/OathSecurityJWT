package com.techprimer.security.jwtsecurity.controller;

import com.techprimer.security.jwtsecurity.model.JwtUser;
import com.techprimer.security.jwtsecurity.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {


    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }


    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser){
        return jwtGenerator.generate(jwtUser);
    }

}
