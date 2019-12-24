package org.junit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Junit1 {
	
	@Test
	public void test()
	{
		System.out.println("The Test Annotation");
	}
	
	@Before
	public void beforeclass()
	{
		System.out.println("Before Class Annotation");
	}

	@After
	public void afterclass()
	{
		System.out.println("After class Annotation");
	}
	
	
	
}
