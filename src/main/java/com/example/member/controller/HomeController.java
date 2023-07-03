package com.example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본페이지 요청 메서드
    @GetMapping("/")
    public String index(){
        return "index"; // /라는 기본 요청이 왔을 때 templates 폴더의 index.hmtl을 찾아감
    }

}
