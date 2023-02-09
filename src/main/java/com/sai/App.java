package com.sai;

import java.util.ResourceBundle;

public class App
{
	public int userLogin(String in_user,String in_pass)
	{
		ResourceBundle rb=ResourceBundle.getBundle("Config");
		String username=rb.getString("user");
		String passwor=rb.getString("password");
		if(username.equals(in_user) && passwor.equals(in_pass))
		{
			return 1;
		}
		else
		{
			return 0;		}
	}
}
