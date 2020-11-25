package workflowmanager;

import org.testng.annotations.Test;

import corefunctions.ReusableClass;


public class SerialTemplate {
	ReusableClass rs=new ReusableClass();
	
	@Test
	public void instatiateSerial() {
	
		rs.searchForWorkflow();
		rs.clickOnActions();
		
	}
	
	@Test(groups= {"OWMSmoke"})
	public void sInstatiateSerial() {
		
		rs.clickOnActions();
			
	}
	
	
	@Test
	public void Vamsi() {
		rs.clickOnActions();
	}
	
	
	
}
