package Test;

import org.testng.annotations.*;


public class day1 {
	@BeforeTest
	public void before() {
		System.out.println("Before Test");
	}
	@Test
	public void demo1() {
		
		System.out.println("demo1");
	}

	@Test
	public void demo2() {
		
		System.out.println("demo2");
	}
	@Test
	public void demo3() {
		
		System.out.println("demo3");
	}
	@Test
	public void demo4() {
		
		System.out.println("demo4");
	}
	@Test
	public void demo5() {
		
		System.out.println("demo5");
	}
	@Test
	public void demo6() {
		
		System.out.println("demo6");
	}
	@AfterTest
	public void demo7() {
		
		System.out.println("Cleanup");
	}
}
