package com.godcoder.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list") //중요하진않음 결국 return부분에서 html문서의 이름을 가져다 써야함.
    public String list(){
        return "board/list";
    }
}
