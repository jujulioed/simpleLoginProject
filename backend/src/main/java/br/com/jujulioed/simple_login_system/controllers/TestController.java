package br.com.jujulioed.simple_login_system.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class TestController {

    @GetMapping("test")
    public ResponseEntity<Map<String, String>> TestGet() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Testing Get API");
        return ResponseEntity.ok(response);
    }

    @PostMapping("test")
    public ResponseEntity<Map<String, String>> TestPost(@RequestBody String body) {
        Map<String, String> response = new HashMap<>();
        response.put("bodySent", body);
        return ResponseEntity.ok(response);
    }
}
