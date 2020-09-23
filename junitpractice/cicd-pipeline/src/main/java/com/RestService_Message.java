package com;
  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService_Message {

        @GetMapping("/hello/{name}")
        public String Hello(@PathVariable("name") String n) {
                return "Hello "+n;
        }
        @GetMapping("/hi/{name}")
        public String Hi(@PathVariable("name") String n) {
            return "Hi "+n;
        }
        @GetMapping("/bye/{name}")
        public String Bye(@PathVariable("name") String n) {
            return "Bye "+n;
        }
        @GetMapping("/bestofluck/{name}")
        public String BestLuck(@PathVariable("name") String n) {
            return "Best of luck "+n;
        }
        @GetMapping("/congrats/{name}")
        public String Congrats(@PathVariable("name") String n) {
            return "Congrats "+n;
        }
}