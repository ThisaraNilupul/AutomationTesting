package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {

//    String name = "Thisara";
//
//    @Test
//    public void valuesEqualCheck(){
//        if(name.equals("Thisara")){
//            System.out.println("Name is equal");
//        }else {
//            System.out.println("Name is not equal");
//        }
//    }

    String actualValue = "Thisara";

    @Test(priority = 0)
    public void valuesEqualCheck(){
        String expectedValue = "Nilupul";
        System.out.println("Prior to valueEqualCheck assertion");
        Assert.assertEquals(actualValue,expectedValue,"Value miss matched");
        System.out.println("After valueEqualCheck assertion");
    }

    @Test(priority = 1)
    public void valueNotEqualCheck(){
        String expectedValue = "Nilupul";
        System.out.println("Prior to valueNotEqualCheck assertion");
        Assert.assertNotEquals(actualValue,expectedValue,"Values matched");
        System.out.println("After valueNotEqualCheck assertion");
    }

    @Test(priority = 2)
    public void trueConditionCheck(){
        System.out.println("Prior to trueConditionCheck assertion");
        Assert.assertTrue(actualValue.startsWith("T"),"Condition return false");
        System.out.println("After trueConditionCheck assertion");
    }

    @Test(priority = 3)
    public void falseConditionCheck(){
        System.out.println("Prior to falseConditionCheck assertion");
        Assert.assertFalse(actualValue.isBlank(),"Condition return true");
        System.out.println("After falseConditionCheck assertion");
    }
}
