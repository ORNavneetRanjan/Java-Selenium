package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Group {

    @Parameters({"NAME"})
    @Test(groups = {"Navneet","Ranjan"})
    public void abc(String name){
        System.out.println(name);
        System.out.println("This is first method from group class");
    }

    @Test(groups = {"Ranjan" })
    public void bringData(){
        System.out.println("Call api for data");
        System.out.println("\nData received");
    }

    @Test(groups = {"Navneet"}, dependsOnMethods = {"bringData"})
    public void algorithm(){
        System.out.println("Applying algorithms on the data we got.");
    }
}
