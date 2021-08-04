package Day1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_TestNGBeforeAfterClass {

    @BeforeClass // will get executed before any test executed (only 1 time)
    public void beforeAllTests(){
        System.out.println("Do something before all the tests");
    }

     @AfterClass // will get executed after all the tests completed (only 1 time)
     public void afterAllTests(){
         System.out.println("Do something after all the tests");
     }

    @Test
    public void test1(){
        String url = "www.techno.study";
        Assert.assertEquals("www.techno.study", url);
    }

    @Test
    public void test2(){
        String url = "www.techno.study";
        Assert.assertEquals("techno.study", url);
    }

    @Test
    public void test3() throws Exception{
        throw new Exception();
    }

}
