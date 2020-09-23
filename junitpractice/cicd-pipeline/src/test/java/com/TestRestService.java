package com;
  
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.RestService_Calcu;
import com.RestService_Message;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestRestService {
	int a=20,b=10;
	String c="Sourav";
	RestService_Calcu rc = new RestService_Calcu();
	RestService_Message rm = new RestService_Message();
        @Test
        public void testAdd() {
                Assertions.assertEquals(rc.Add(a,b), 30);
        }
        @Test
        public void testSub() {
            Assertions.assertEquals(rc.Sub(a,b), 10);
    }
        @Test
        public void testMul() {
            Assertions.assertEquals(rc.Mul(a,b), 200);
    }
        @Test
        public void testDiv() {
            Assertions.assertEquals(rc.Div(a,b), 2);
    }
        @Test
        public void testRem() {
            Assertions.assertEquals(rc.Rem(a,b), 0);
    }
        @Test
        public void sayHello() {
            Assertions.assertEquals(rm.Hello(c), "Hello Sourav");
    }
        @Test
        public void sayHi() {
            Assertions.assertEquals(rm.Hi(c), "Hi Sourav");
    }
        @Test
        public void sayBye() {
            Assertions.assertEquals(rm.Bye(c), "Bye Sourav");
    }
        @Test
        public void sayBestLuck() {
            Assertions.assertEquals(rm.BestLuck(c), "Best of luck Sourav");
    }
        @Test
        public void sayCongrats() {
            Assertions.assertEquals(rm.Congrats(c), "Congrats Sourav");
    }
}
