package test;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import io.opentelemetry.api.internal.Utils;
import page.JpetstoreBaseclass;
import utilities.Utilityclass;

	public class JpetstoreTestlogingpage extends JpetstoreBaseclass {
	  
	    
	    

	    @Test (priority=1)
	    public void JpetstoreTestloginingpage() throws Exception {
	        String xl = "C:\\Users\\iamma\\OneDrive\\Desktop\\datadriven.xlsx";
	        String sheet = "Sheet1";

	        
	        int rowCount = Utilityclass.getRowCount(xl, sheet);

	        JpetstoreTestlogingpage ob= new JpetstoreTestlogingpage();
	       

	        for (int i = 1; i <= rowCount; i++) {
	            String username = Utilityclass.getCellValue(xl, sheet, i, 0);
	            System.out.println("username--->" + username);
	            String pwd = Utilityclass.getCellValue(xl, sheet, i, 1);
	            System.out.println("password--->" + pwd);
	            

	          
	            ob.test(username, pwd);
	            
	            
	            ob.submitloginbutton();
	          
	            Thread.sleep(3000);
	            
	            
	            
	        }
	    }

		private void submitloginbutton() {
			// TODO Auto-generated method stub
			
		}

		private void test(String username, String pwd) {
			// TODO Auto-generated method stub
			
		}
	    
	    
	    
	    
	}


