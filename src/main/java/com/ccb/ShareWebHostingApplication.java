package com.ccb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShareWebHostingApplication{
    public static void main(String[] args) {
        SpringApplication.run(ShareWebHostingApplication.class, args);
    }

    @RequestMapping("/")
    public String hello(){
        return "123hello auto build of jenkins";
    }
}

