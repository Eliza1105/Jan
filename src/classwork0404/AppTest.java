package classwork0404;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

        @Test
         public void testCalcOne() {
            int res1 = LastDigit.getResult(2,2);
            Assertions.assertEquals(4, res1);
            int res2 = LastDigit.getResult(3,2);
            Assertions.assertEquals(9, res2);
            int res3 = LastDigit.getResult(3,4);
            Assertions.assertEquals(1, res3);
            int res4 = LastDigit.getResult(10,500);
            Assertions.assertEquals(0, res4);
        }
    }

