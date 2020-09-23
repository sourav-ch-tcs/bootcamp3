package com;
  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService_Calcu {

        @GetMapping("/add/{num1}/{num2}")
        public int Add(@PathVariable("num1")int a, @PathVariable("num2")int b) {
                return a+b;
        }
        @GetMapping("/sub/{num1}/{num2}")
        public int Sub(@PathVariable("num1")int a, @PathVariable("num2")int b) {
                return a-b;
        }
        @GetMapping("/mul/{num1}/{num2}")
        public int Mul(@PathVariable("num1")int a, @PathVariable("num2")int b) {
                return a*b;
        }
        @GetMapping("/div/{num1}/{num2}")
        public int Div(@PathVariable("num1")int a, @PathVariable("num2")int b) {
                return a/b;
        }
        @GetMapping("/rem/{num1}/{num2}")
        public int Rem(@PathVariable("num1")int a, @PathVariable("num2")int b) {
                return a%b;
        }
} 