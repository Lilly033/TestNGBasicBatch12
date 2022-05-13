package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {

    @Test(groups = "smoke")
    public void firstTest(){
        System.out.println("This is my first testcase");

    }
    @Test
    public void secondTest(){
        System.out.println("This is my second testcase");
    }
    @Test
    public void thirdTest(){
        System.out.println("This is my third testcase");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("***** I am Precodition ******");  //runs before every testcase
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("^^^^ I am Postcodition ^^^^^^");
    }
}
