package br.edu.atitus.api_example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws/greeting")
public class GreetingController {

    @GetMapping(value = {"","/{namePath}"})
    public ResponseEntity<String> getGreeting(
            @RequestParam(required = false) String name,
            @PathVariable(required = false) String namePath) {
        String greeting = "Hello";
        if (name == null)
            name = namePath != null ? namePath : "World";
        return ResponseEntity.ok(greeting + " " + name + "!");
    }
}
