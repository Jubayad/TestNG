package Piit.training.session.AmazonTestNGFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazon.Home;
import Amazon.Results;
import Common.Commons;

public class AmazonToPurchase extends Commons{
	@Test	
	public void f() {
		Home home = new Home();
		home.searchfieldsend("Computer");
		home.searchbuttonclicking();
		Thread.sleep(6000);
		Results results = new Results(driver);
		int elements = results.ResultsToVerify();
		System.out.println(elements);
		if(elements == 1) {
			System.out.println("Results is existing for amazon");
		}
		else (elements){
			System.out.println("Result is not displaying");
		}
		SoftAssert sg= new SoftAssert();
		sg.assertEquals(1, elements);
		sg.assertAll();
		results.ComputerToClick();
	
}
}
