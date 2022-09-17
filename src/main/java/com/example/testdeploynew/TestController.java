package com.example.testdeploynew;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TestController {
    @RequestMapping("/haha")
    public String index_2() {
        return "Nguyễn Phạm Hùng Phi";
    }
}
