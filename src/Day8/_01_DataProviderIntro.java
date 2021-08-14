package Day8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_DataProviderIntro {

    /*
        DataProvider is working as parameters
            It will help us to send data to our test methods
     */

    @Test(dataProvider = "TestData")
    public void test(String data){
        System.out.println(data);
    }


    @DataProvider(name = "TestData")
    public Object[][] testData() {

        return new Object[][]{
                {"Test1"}, {"Test2"}, {"Test3"}, {"Test4"}
        };
    }


    @Test(dataProvider = "NameProvider")
    public void printFullName(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }


    @DataProvider(name = "NameProvider")
    public Object[][] fullNameProvider(){

        return new Object[][]{
                {"Mark", "Gerrard"}, {"Andre", "Pirlo"}, {"Frank", "Lampard"}
        };
    }












}
