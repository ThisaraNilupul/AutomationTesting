package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {

    SoftAssert softAssert = new SoftAssert();

    String actualValue = "Thisara";

    @Test(priority = 0)
    public void valuesEqualCheck(){
        String expectedValue = "Nilupul";
        System.out.println("Prior to valueEqualCheck assertion");
        softAssert.assertEquals(actualValue,expectedValue,"Value miss matched");
        System.out.println("After valueEqualCheck assertion");
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void valueNotEqualCheck(){
        String expectedValue = "Nilupul";
        System.out.println("Prior to valueNotEqualCheck assertion");
        softAssert.assertNotEquals(actualValue,expectedValue,"Values matched");
        System.out.println("After valueNotEqualCheck assertion");
    }

    @Test(priority = 2)
    public void trueConditionCheck(){
        System.out.println("Prior to trueConditionCheck assertion");
        softAssert.assertTrue(actualValue.startsWith("T"),"Condition return false");
        System.out.println("After trueConditionCheck assertion");
    }

    @Test(priority = 3)
    public void falseConditionCheck(){
        System.out.println("Prior to falseConditionCheck assertion");
        softAssert.assertFalse(actualValue.isBlank(),"Condition return true");
        System.out.println("After falseConditionCheck assertion");
    }
}
