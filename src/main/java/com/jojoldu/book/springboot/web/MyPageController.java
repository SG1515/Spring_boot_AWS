package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPageController {

    @GetMapping("/mypage")
    public String hello() {
        return "hello";
    }
}
