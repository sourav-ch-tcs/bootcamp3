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

        @Test
        public void testMessage() {
        		RestService_Calcu rc = new RestService_Calcu();
        		int a=20,b=10;
        		String c="Sourav";
        		RestService_Message rm = new RestService_Message();
                Assertions.assertEquals(rc.Add(a,b), 30);
                Assertions.assertEquals(rc.Sub(a,b), 10);
                Assertions.assertEquals(rc.Mul(a,b), 200);
                Assertions.assertEquals(rc.Div(a,b), 2);
                Assertions.assertEquals(rc.Rem(a,b), 0);
                Assertions.assertEquals(rm.Hello(c), "Hello Sourav");
                Assertions.assertEquals(rm.Hi(c), "Hi Sourav");
                Assertions.assertEquals(rm.Bye(c), "Bye Sourav");
                Assertions.assertEquals(rm.BestLuck(c), "Best of luck Sourav");
                Assertions.assertEquals(rm.Congrats(c), "Congrats Sourav");
        }

}
