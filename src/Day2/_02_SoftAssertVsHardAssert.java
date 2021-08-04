package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _02_SoftAssertVsHardAssert {

    // Hard Assert
    // When you do hard assert if Assertion fails code execution will stop
    @Test
    public void hardAssert(){
        System.out.println("Before Assertion");
        Assert.fail();
        System.out.println("After Assertion");
    }

    // Soft Assert
    // Use soft assert if you want to continue testing even though some assertions failed already
    @Test
    public void softAssert(){
        SoftAssert sf = new SoftAssert();
        System.out.println("Before Assertion");
        sf.fail();
        System.out.println("After Assertion");

        sf.assertAll(); // will check every assertion and throw an exception if any assertion failed
    }

}
