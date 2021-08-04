package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class _01_TestNGAssertions {


    @Test
    public void assertEquals(){
        String expected = "Hello";
        String actual = "Hello";

        Assert.assertEquals(actual, expected, "Actual should be equal to expected!");
    }

    @Test
    public void assertEquals2(){
        String expected = "Hello";
        String actual = "hello";

        Assert.assertEquals(actual, expected, "Actual should be equal to Expected!");
    }

    @Test
    public void assertEquals3(){
        String[] expected = {"Hello", "2"};
        String[] actual = {"Hello", "2"};

        Assert.assertEquals(actual, expected, "Actual should be equal to Expected!");
    }

    @Test
    public void assertEqualsNoOrder(){
        String[] expected = {"Hello", "2"};
        String[] actual = {"2","Hello"};

        Assert.assertEqualsNoOrder(actual, expected, "Actual should be equal to Expected!");
    }

    @Test
    public void assertNotEquals(){
        String[] expected = {"Hello", "2"};
        String[] actual = {"Hello", "2"};

        Assert.assertNotEquals(actual, expected, "Actual should not be equal to Expected!");
    }

    @Test
    public void assertNotEquals2(){
        String[] expected = {"Hello", "1"};
        String[] actual = {"Hello", "2"};

        Assert.assertNotEquals(actual, expected, "Actual should not be equal to Expected!");
    }

    @Test
    public void assertSame(){
        String[] expected = {"Hello"};
        String[] actual = {"Hello"};

        Assert.assertSame(actual, expected, "Actual and Expected should point to same object");
    }

    @Test
    public void assertSame2(){
        String[] expected = {"Hello"};
        String[] actual = expected;

        Assert.assertSame(actual, expected, "Actual and Expected should point to same object");
    }

    @Test
    public void assertNotSame(){
        String[] expected = {"Hello"};
        String[] actual = {"Hello"};

        Assert.assertNotSame(actual, expected, "Actual and Expected should not point to same object");
    }

    @Test
    public void assertNotSame2(){
            String[] expected = {"Hello"};
            String[] actual = expected;

            Assert.assertNotSame(actual, expected, "Actual and Expected should not point to same object");
    }

    @Test
    public void assertNotNull(){
        String nullString = null;
        Assert.assertNotNull(nullString);
    }

    @Test
    public void assertNotNull2(){
        String notNullString = "Something";
        Assert.assertNotNull(notNullString);
    }

    public boolean isDataAvailable(){
        return new Random().nextBoolean();
    }

    @Test
    public void assertTrue(){
        boolean actual = isDataAvailable();
        Assert.assertTrue(actual);
    }

    @Test
    public void assertFalse(){
        boolean actual = isDataAvailable();
        Assert.assertFalse(actual);
    }

    @Test
    public void assertFail(){
        if (!isDataAvailable()){
            Assert.fail("Condition is false!");
        }
    }

    @Test
    public void assertFail2(){
        try {
            throw new Exception();
        } catch (Exception e){
            Assert.fail("Test failed because we caught an exception");
        }
    }

}
