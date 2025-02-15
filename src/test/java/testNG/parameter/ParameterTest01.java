package testNG.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest01 {

    @Test
    @Parameters({"val1","val2"})
    public void sum(@Optional("20") int v1,@Optional("15") int v2){
        int finalSum = v1 + v2;
        System.out.println("The final sum of the given values is: " + finalSum);
    }
}
