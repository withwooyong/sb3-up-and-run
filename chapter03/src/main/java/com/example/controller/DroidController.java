package com.example.controller;

import com.example.dto.Droid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/droid")
@RequiredArgsConstructor
class DroidController {

    @GetMapping("/get")
    Droid getDroid() {
        return Droid.builder()
                .id(UUID.randomUUID().toString())
                .description("This is the droid you are looking for")
                .build();
    }
}