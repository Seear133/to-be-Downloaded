package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class TestNGDataProviderConcept {
	
	@Test (dataProvider = "getExcelData")
	public void test(String firstName, String lastName, String email, String password) {
		System.out.println("first name is: " +firstName);
		System.out.println("first name is: " +lastName);
		System.out.println("first name is: " +email);
		System.out.println("first name is: " +password);
		
	}
	@DataProvider()
	public Object[][] getExcelData(){
		Object data [][]= ExcelUtility.getExcelData("info");
		return data;
	}
	
	
	
	
	
	

}
