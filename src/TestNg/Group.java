package TestNg;

import org.testng.annotations.DataProvider;
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

    @Test(groups = {"Navneet"}, dependsOnMethods = {"bringData"}, timeOut = 4000)
    public void algorithm(){
        System.out.println("Applying algorithms on the data we got.");
    }

    @DataProvider(name = "data")
    public String[][] getData(){
        String[][] arr = new String[3][2];
        //first set
        arr[0][0] = "hi@hello21.com";
        arr[0][1] = "password1";

        //second set
        arr[1][0] = "hi@hello1.com";
        arr[1][1] = "password2";

        //third set
        arr[2][0] = "hi@hello2.com";
        arr[2][1] = "password3";

        return arr;
    }

    @Test(dataProvider = "data")
    private void display(String id, String pass){
        System.out.println("ID: " + id);
        System.out.println("PASSWORD: " + pass);
    }
}
