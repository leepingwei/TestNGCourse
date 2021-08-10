package Day5;

import org.testng.annotations.Test;

public class _04_SecondGroupsClass {

    // Can add multiple parameters (groups, priority)
    @Test(groups = "Regression", priority = 3)
    public void TestOne(){
        System.out.println("TestOne");
    }

    @Test(groups = "SmokeTest", enabled = false)
    public void TestTwo(){
        System.out.println("TestTwo");
    }

    @Test(groups = "Regression", priority = 1)
    public void TestThree(){
        System.out.println("TestThree");
    }

    @Test(groups = "SmokeTest")
    public void TestFour(){
        System.out.println("TestFour");
    }

    @Test(groups = "Regression", priority = 2)
    public void TestFive(){
        System.out.println("TestFive");
    }

    @Test(groups = "SmokeTest")
    public void TestSix(){
        System.out.println("TestSix");
    }

    @Test
    public void testInNoGroup(){ System.out.println("This test is not in any group!"); }

}
