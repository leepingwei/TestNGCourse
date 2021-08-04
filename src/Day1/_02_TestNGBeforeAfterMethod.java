package Day1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _02_TestNGBeforeAfterMethod {


    @BeforeMethod // will get executed before each @Test
    public void beforeEachTest(){
        System.out.println("Do something before each test");
    }

    @AfterMethod // will get executed after each @Test
    public void afterEachTest(){
        System.out.println("Do something after each test");
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
