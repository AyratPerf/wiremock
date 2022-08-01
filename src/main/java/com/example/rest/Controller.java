package com.example.rest;

import Objects.Request;
import Objects.DataBaseObjects.Check;
import Objects.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {

    private Check check = new Check();


    @PostMapping("/request")
    public Request request(@RequestBody Request request) {
        boolean isInBL = check.checker(request.user.getFirstname(), request.user.getLastname(),
                request.user.passport.getSeries(), request.user.passport.getNumber());
        return new Request(request.getMsgId(), request.getMsgType(), request.getUser(), isInBL);
    }
}

