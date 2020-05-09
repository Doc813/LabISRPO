package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import app.*;
public class OperandTests {
    @Test
    public void testSetGet() {
        Operand op = new Operand();
        double num;
        for (int i = 0; i < 100; i++) {
            num = (double) ( Math.random() * 1000 );
            op.Set_value(num);
            assertEquals(num, op.Get_value(), 0.0001);
        }  
    }
}
