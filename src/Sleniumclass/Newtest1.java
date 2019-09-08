package Sleniumclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Newtest1 {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method statment");
  }

  @AfterMethod
  public void afterMethod() {
 System.out.println("This is after method statment");
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class statment");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class statment");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before Test statment");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test statment");
  }

}
