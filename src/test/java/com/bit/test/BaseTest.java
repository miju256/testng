package com.bit.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("THis is bm");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("THis is am");
  }


  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("THis is bc");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("THis is ac");
  }

  @BeforeTest //collection of class is called test 
  public void beforeTest() {
	  System.out.println("THis is bt");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("THis is at");
  }

  @BeforeSuite //Collection of test is called suite.
  public void beforeSuite() {
	  System.out.println("THis is bs");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("THis is as");
  }
  

}
