package mercuryTours.tests;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registrationFuncTest extends baseTest {
	
	@Test(dataProvider="getData")
	public void registrationForm(HashMap<String,String>input) throws IOException {
		registerPage.fillForm(input);
		boolean match=input.get("pwd").equals(input.get("copwd"));
		if(!match) {
			boolean veri=registerPage.checkRegister("PAssword and con.password does not match");
			Assert.assertTrue(veri);
			getScreenShot(registerPage.getInstance(),"coPwd");
		}
		else {
			boolean veri=registerPage.checkSuccess
					("https://demo.guru99.com/test/newtours/register_sucess.php");
			Assert.assertTrue(veri);
			getScreenShot(registerPage.getInstance(),"SuccessfulRegistration");
		}
		System.out.println("Git test");
		System.out.println("Git test2");
		System.out.println("Git test3");
		System.out.println("Git test4");
	}
	
	@Test
	public void itest() {
		System.out.println("Hi this is itest");
	}
	
	@Test
	public void as() {
		System.out.println("as");
	}
	
	@Test
	public void asi() {
		System.out.println("asi");
	}
	
	
	@DataProvider
	public Object[][] getData(){
		HashMap<String,String>map=new HashMap<String,String>();
		map.put("fName","Ajay");
		map.put("lName","Sai");
		map.put("ph","9149143419");
		map.put("mail","saaj@gmail.com");
		map.put("add","5-56, Gachibowli");
		map.put("city","Kakinada");
		map.put("state","AndhraPradesh");
		map.put("pcode","500201");
		map.put("cntry","INDIA");
		map.put("uName","SaiAjay");
		map.put("pwd","123456");
		map.put("copwd","12345");
		
		HashMap<String,String>map1=new HashMap<String,String>();
		map1.put("fName","Ajay");
		map1.put("lName","Sai");
		map1.put("ph","9149143419");
		map1.put("mail","saaj@gmail.com");
		map1.put("add","5-56, Gachibowli");
		map1.put("city","Kakinada");
		map1.put("state","AndhraPradesh");
		map1.put("pcode","500201");
		map1.put("cntry","INDIA");
		map1.put("uName","SaiAjay");
		map1.put("pwd","123456");
		map1.put("copwd","123456");
		return new Object[][] {{map},{map1}};
		
	}

}
