package com.example.demo;

import com.example.demo.controller.DemoController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = DemoController.class)
@AutoConfigureMockMvc(addFilters = false)
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
class DemoApplicationTests {

  @Test
  void validate() {
    Assertions.assertTrue(Boolean.TRUE);
  }

}
