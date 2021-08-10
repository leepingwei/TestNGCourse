package Day5;

import org.testng.annotations.*;

public class _01_TestNGXMLAnnotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeTest // This will get executed before <test> tag not @Test
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @Test
    public void test(){
        System.out.println("Test");
    }

    @AfterTest // This will get executed after <test> tag not @Test
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

}
