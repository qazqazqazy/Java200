package task_5;

import org.junit.Assert;
import org.junit.Test;
import task_5.operations.*;


public class CalculatorTest {
    //@Rule
    //public ExpectedException exception = ExpectedException.none();

    @Test
    public void sumname() {
        AnyOp operation = new Sum();
        String name1 = operation.getName();
        Assert.assertEquals("+",name1);
    }

    @Test
    public void sumcalc() {
        AnyOp operation = new Sum();
        Double res = operation.result(2.0, 1.0);
        Assert.assertEquals(3.0, res,0.0);
    }

    @Test
    public void minname() {
        AnyOp operation = new Min();
        String name2 = operation.getName();
        Assert.assertEquals("-",name2);
    }
    @Test
    public void mincalc() {
        AnyOp operation = new Min();
        Double res = operation.result(2.0, 11.111);
        Assert.assertEquals(-9.111, res,0.0);
    }

    @Test
    public void multname() {
        AnyOp operation = new Mult();
        String name3 = operation.getName();
        Assert.assertEquals("*",name3);
    }

    @Test
    public void multcalc() {
        AnyOp operation = new Mult();
        Double res = operation.result(21.2, 11.111);
        Assert.assertEquals(235.5532, res,0.0);
    }

    @Test
    public void delname() {
        AnyOp operation = new Del();
        String name4 = operation.getName();
        Assert.assertEquals("/",name4);
    }

    @Test
    public void delcalc() {
        AnyOp operation = new Del();
        Double res = operation.result(15.0, 3.0);
        Assert.assertEquals(5.0, res,0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testArithmeticException () {
        AnyOp operation = new Del();
        Double res = operation.result(15.0, 0.0);
    }


    /*@Test
    public void delcalc2() throws ArithmeticException {
        AnyOp operation = new Del();
        try {
            Double res = operation.result(15.0, 0.0);
            Assert.fail("Expected ArithmeticException");
        }
        catch (ArithmeticException thrown) {
        Assert.assertNotEquals("", thrown.getMessage());
        }
    } */
    /*
    @Test

    public void delcalc3() {
        AnyOp operation = new Del();
        exception.expect(ArithmeticException.class);
        exception.expectMessage(containsString("На 0 делить нельзя"));
            Double res = operation.result(15.0, 0.0);

        }
          */

    }
