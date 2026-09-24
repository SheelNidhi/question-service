package com.sheel.controller;

import com.sheel.common.DemoComponent;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequiredArgsConstructor
@RequestMapping("/api")
public class QuestionController {
    private final DemoComponent demoComponent;

    @GetMapping("/hello")
    public String getDetails(){
        return "something";

    }
}
