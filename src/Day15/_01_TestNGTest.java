package Day15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_TestNGTest {

    @Test
    public void test1(){
        String url = "www.techno.study";

        // each test should have at least one Assertion
        Assert.assertEquals("www.techno.study", url);
    }

    @Test
    public void test2(){
        String url = "www.techno.study";
        Assert.assertEquals("techno.study", url);
    }

    @Test
    public void test3() throws Exception{
        // automatic exception handling
        // any exceptions here will fail the test

        // assume that something wrong with code
        throw new Exception();
    }

}
