package com.example.testdeploynew;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HeheController {
    @RequestMapping("/hihi")
    public String index_2() {
        return "Viet Anh";
    }
}
