package com.teacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teacher on 6/26/17.
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String welcome() {
        return "awesome, your spring boot application";
    }
}
