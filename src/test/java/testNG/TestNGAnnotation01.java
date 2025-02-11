package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotation01 {
    public static void main(String[] args) {
        System.out.println("This is not a testNG test 01");
        TestNGAnnotation01 testNGAnnotation01 = new TestNGAnnotation01();
        testNGAnnotation01.NotATestNGMethod();
    }

    public void NotATestNGMethod(){
        System.out.println("This is not a testNG test 02");
    }

    @Test
    public void Test(){
        System.out.println("test 01");
    }
}
