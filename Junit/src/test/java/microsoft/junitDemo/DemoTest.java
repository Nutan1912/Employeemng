package microsoft.junitDemo;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class DemoTest {
	//@RepeatedTest (value=5)
	@Test
	@DisplayName("Database Testcase")
	public void demo()
	{
		System.out.println("This is repeted Test");
	}
	
		
}
