package test;


	import org.testng.annotations.Test;

import page.JpetstoreBaseclass;
import page.JpetstoreCartpage;

	public class JpetstoreTestcartpage  extends JpetstoreBaseclass{
		
		
		@Test 
	    public void jpetstoretestcartpage() throws Exception {
	        
			JpetstoreCartpage ob= new JpetstoreCartpage(driver);
			
		
		ob.dropdownmethord();
		
		ob.details("Madhavika", "maadhu123");
		
		ob.addresss();
	ob.ending();
		}

}
