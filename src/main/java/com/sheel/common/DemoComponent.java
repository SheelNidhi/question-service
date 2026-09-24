package com.sheel.common;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class DemoComponent {
    private final  MyBean myBean;
    private final Computer computer;
    public String getCompilationDetail(String str){
        computer.compile();
        return "something";
    }
}
