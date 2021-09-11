package com.susan.houseutils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Susan.
 * User: totani
 * Date: 2021/09/11
 * Time: 9:22 오후
 */

@RestController
public class HealthCheckController {

    @GetMapping("/api/ping")
    public String ping(){
        return "OK";
    }
}
