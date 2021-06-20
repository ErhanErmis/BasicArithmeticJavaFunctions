package basicFunctions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {
    Calculations obj= new Calculations();
    private Object AssertionFailedError;

    @Test
    void addition() {

        Assertions.assertEquals(11.0,obj.addition(5.0,6.0));
        Assertions.assertEquals(-11.0,obj.addition(-5.0,-6.0));


    }

    @Test
    void subtraction() {
        Assertions.assertEquals(1.0,obj.subtraction(6.0,5.0));
        Assertions.assertEquals(-1.0,obj.subtraction(-6.0,-5.0));

    }

    @Test
    void multiplication() {
        Assertions.assertEquals(12.0,obj.multiplication(6.0,2.0));
        Assertions.assertEquals(-12.0,obj.multiplication(-6.0,2.0));
    }

    @Test
    void divition() {
        Assertions.assertEquals(3.0,obj.divition(6.0,2.0));
        Assertions.assertEquals(-3.0,obj.divition(-6.0,2.0));
      
    }
}