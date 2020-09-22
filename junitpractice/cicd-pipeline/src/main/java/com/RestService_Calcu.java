package com;
  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService_Calcu {

        @GetMapping("/add")
        public int Add(int a, int b) {
                return a+b;
        }
        @GetMapping("/sub")
        public int Sub(int a, int b) {
                return a-b;
        }
        @GetMapping("/mul")
        public int Mul(int a, int b) {
                return a*b;
        }
        @GetMapping("/div")
        public int Div(int a, int b) {
                return a/b;
        }
        @GetMapping("/rem")
        public int Rem(int a, int b) {
                return a%b;
        }
} 