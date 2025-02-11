package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {

    @Test(priority = 0)
    public void testSum(){
        System.out.println("*************** First test case for cal sum ******************");
        System.out.println("*************** First sum calculation ************************");
        int actualValueSum1 = ArithmeticOperator.calSum(20, 30);
        System.out.println("Actual sum 1 value is: " + actualValueSum1);
        Assert.assertEquals(actualValueSum1,50,"Failed to cal sum 1");

        System.out.println("*************** Second sum calculation ***********************");
        int actualValueSum2 = ArithmeticOperator.calSum(10, 20);
        System.out.println("Actual sum 2 value is: " + actualValueSum2);
        Assert.assertEquals(actualValueSum2,30,"Failed to cal sum 2");

        System.out.println("*************** Third sum calculation ***********************");
        int actualValueSum3 = ArithmeticOperator.calSum(4, 8);
        System.out.println("Actual sum 3 value is: " + actualValueSum3);
        Assert.assertEquals(actualValueSum3,12,"Failed to cal sum 3");
    }
}
