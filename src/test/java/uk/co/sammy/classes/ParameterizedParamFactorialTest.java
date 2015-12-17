package uk.co.sammy.classes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class ParameterizedParamFactorialTest {
	@Parameter(value = 0)
	public int number;
	
	@Parameter(value = 1)
	public int expectedResult;

	@Parameters
	public static Collection<Object[]> factorialData(){
		return Arrays.asList(new Object[][]{
			{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}
		});		
	}
	
	@Test
	public void factorial(){
		Factorial facts = new Factorial();
		assertThat(facts.factorial(number), equalTo(expectedResult));
	}
}
