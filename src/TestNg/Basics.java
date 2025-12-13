package TestNg;

import org.testng.annotations.*;


class Test1 {



    @BeforeTest
    public void Btest1(){
        System.out.println("\nThis is before Test from Test 1 class");
    }

    @AfterTest
    private void Atest1(){
        System.out.println("\nThis is After Test from Test 1 class");
    }

    @Parameters({"NAME"})
    @Test
    public void fun1(String name){
        System.out.println(name);
        System.out.println("This is test1 fun1");
    }

    @Test
    public void noTest(){
        System.out.println("This is without test ng");
    }

    @Test
    public void commonTest(){
        System.out.println("This is common test from test1");
    }
}

class Basics {
    @Test
    public void func(){
        System.out.println("This is test");
    }

    @Test
    public void fun1(){
        System.out.println("This is second test case");
    }

    @Test(priority = 1)
    public void fun2(){
        System.out.println("This is third test case");
    }

    @Test
    public void commonTest(){
        System.out.println("This is common test for Basics.");
    }

    @BeforeTest
    public void clean(){
        System.out.println("Cleaning the data");
    }

    @AfterTest
    public void byebye(){
        System.out.println("Thankyou for running the test cases");
    }

    @BeforeMethod
    public void before(){
        System.out.println("\nRunning different Method\n");
    }

    @BeforeClass
    public void bClass(){
        System.out.println("\nRunning the 'Basics' Class\n");
    }

}

class TestSuite{
    @Test
    private void func(){
        System.out.println("This is private test");
    }

    @Test
    public void fun1(){
        System.out.println("This is second test case");
    }

    public void commonTest(){
        System.out.println("This is common test for TestSuite");
    }
}

