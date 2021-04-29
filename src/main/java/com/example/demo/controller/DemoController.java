package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

  @RequestMapping(value = "/getname")
  public ResponseEntity<String> getName() {
    String res = "Abcdbc";
    return new ResponseEntity<>(res, HttpStatus.OK);
  }
}
