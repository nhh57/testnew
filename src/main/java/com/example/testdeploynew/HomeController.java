package com.example.testdeploynew;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("")
    public String index() {
        return "Nguyễn Hoàng Hải huhuhhihihih";
    }

    @RequestMapping("/index")
    public String index_2() {
        return "Trần Hoàng Namss";
    }
}
