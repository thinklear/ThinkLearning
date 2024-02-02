import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassBNG {

	public class FristTestNG {
		
		@BeforeSuite
		public void setUp() {
		System.out.println("set up url");
		}
		
		@BeforeTest
		public void test() {
			System.out.println("Test browser");
			
		}
		@BeforeClass
		public void BC() {
			System.out.println("BC");
		}
		@BeforeMethod
		 public void launchMethod() {
			System.out.println("Lauch chrome browser");
			
		}
		@Test
		public void Test() {
			System.out.println("Test1");
		}
		@Test
		public void Test2() {
			System.out.println("Test2");
		}
			
		
		@AfterMethod
		public void aM() {
			System.out.println("Logout");
		}
		@AfterClass
		public void aC() {
			System.out.println("AC");
		}
			
		
		@AfterTest
		public void aT() {
			System.out.println("AT");	
		}
		@AfterSuite
		public void aS() {
			System.out.println("AS");
		}
	}
			

}
