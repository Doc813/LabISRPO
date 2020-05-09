package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import app.*;
public class CalculatorTests {
    @Test
    public void testCalculate() {
        Calculator calc = new Calculator();
        double num1, num2;
        double res;
        for (int i = 0; i < 100; i++) {
            num1 = (double) ( Math.random() * 1000 + 1 );
            num2 = (double) ( Math.random() * 1000 + 1 );
            calc.Set_First_op(num1);
            calc.Set_Second_op(num2);
            calc.Set_operation('+');
            res = num1+num2;
            assertEquals(res, calc.Calculate(), 0.00001);
            calc.Set_operation('-');
            res = num1-num2;
            assertEquals(res, calc.Calculate(), 0.00001);
            calc.Set_operation('/');
            res = num1/num2;
            assertEquals(res, calc.Calculate(), 0.00001);
            calc.Set_operation('*');
            res = num1*num2;
            assertEquals(res, calc.Calculate(), 0.00001);
            calc.Set_operation('^');
            res = Math.pow(num1, num2);
            assertEquals(res, calc.Calculate(), 0.00001);
        }  
    }
}
