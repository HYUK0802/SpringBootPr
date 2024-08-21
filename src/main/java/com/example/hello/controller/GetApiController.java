package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {


    @GetMapping(path = "/hello")
    public String getHello() {
        return "get Hello";
    }
    @GetMapping(path = "/hi")
    public String hi() {
        return "hi";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable("name") String name) {

        System.out.println("PathVariable : " +name);

        return name;
    }

    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String,String> queryParam) {

         StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(
                entry -> {
                    System.out.println(entry.getKey());
                    System.out.println(entry.getValue());
                    System.out.println("\n");

                    sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
                }
        );
        return sb.toString();
    }
}
