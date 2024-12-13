package page;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeSuite;

	public class JpetstoreBaseclass {

	    public static WebDriver driver;
	    

	    @BeforeSuite
	    public void setup() {
	       
	        driver = new ChromeDriver();
	        driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=785B47AC69C335D031806D860EA85B3E?signonForm=");
	        driver.manage().window().maximize();
	       
	    }

	  
	  }
	        
	        
	        
	        
	    
	    
	    


