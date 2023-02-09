package com.sai;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyApp

{
	@Test
	public void testLogin1()
	{
		App obj=new App();
		Assert.assertEquals(0,obj.userLogin("abc","abc123"));
	}
	@Test
	public void testLogin2()
	{
		App obj=new App();
		Assert.assertEquals(1,obj.userLogin("abc","abc@123"));
	}
	
}
