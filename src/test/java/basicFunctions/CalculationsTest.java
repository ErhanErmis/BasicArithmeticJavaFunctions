package basicFunctions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
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
        Assertions.assertEquals(1.7976931348623157E308,obj.subtraction(Double.MAX_VALUE, Double.MIN_VALUE));


        try {
            Double div = obj.division(6.0, 0.0);
            if(div==Double.POSITIVE_INFINITY) {
                throw new ArithmeticException();
            }
        }catch (ArithmeticException ae) {
            System.out.println("A number can not be divided by zero.This is an error.");
            }
    }

    @Test
    void multiplication() {
        Assertions.assertEquals(12.0,obj.multiplication(6.0,2.0));
        Assertions.assertEquals(-12.0,obj.multiplication(-6.0,2.0));
        Assertions.assertEquals(0.0,obj.multiplication(-6.0,0.0));

    }

    @Test
    void division() {
       Assertions.assertEquals(3.0,obj.division(6.0,2.0));
        Assertions.assertEquals(-3.0,obj.division(-6.0,2.0));
        Double result=Double.POSITIVE_INFINITY;
        Assertions.assertEquals(result,obj.division(Double.MAX_VALUE, Double.MIN_VALUE));
      
    }
}