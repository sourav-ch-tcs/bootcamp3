package com;
  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService_Message {

        @GetMapping("/hello")
        public String Hello(String n) {
                return "Hello "+n;
        }
        @GetMapping("/hi")
        public String Hi(String n) {
            return "Hi "+n;
        }
        @GetMapping("/bye")
        public String Bye(String n) {
            return "Bye "+n;
        }
        @GetMapping("/bestofluck")
        public String BestLuck(String n) {
            return "Best of luck "+n;
        }
        @GetMapping("/congrats")
        public String Congrats(String n) {
            return "Congrats "+n;
        }
} 