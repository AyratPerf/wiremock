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
    boolean isInBL = check.checker("Ayrat", "Karimov", 1212, 123123);


    @PostMapping("/request")
    public Request request(@RequestBody Request request) {
        return new Request(request.getMsgId(), request.getMsgType(), request.getUser(), isInBL);
    }
}

