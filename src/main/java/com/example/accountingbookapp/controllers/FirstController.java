package com.example.accountingbookapp.controllers;

import com.example.accountingbookapp.info.Information;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String appStarting() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        return new Information().toString();
    }


}
