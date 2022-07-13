package com.example.rest;

import Objects.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
    boolean isInBL = false;

    @PostMapping("/request")
    public Request request(@RequestBody Request request) {
        return new Request(request.getMsgId(), request.getMsgType(), request.getUser(), isInBL);
    }
}
