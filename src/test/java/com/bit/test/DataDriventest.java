package com.bit.test;

import org.testng.annotations.Test;

public class DataDriventest {
	@Test(dataProvider = "dp")
	  public void f(Integer n, String s) {
	  }
}
