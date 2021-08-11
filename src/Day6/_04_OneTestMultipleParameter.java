package Day6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _04_OneTestMultipleParameter {

    @Test
    @Parameters({"param1", "param2"})
    public void test(String s1, String s2){
        System.out.println(s1);
        System.out.println(s2);
    }

}
