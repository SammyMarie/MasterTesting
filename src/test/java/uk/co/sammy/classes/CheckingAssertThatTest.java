package uk.co.sammy.classes;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static uk.co.sammy.classes.LessThanOrEqual.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CheckingAssertThatTest {
	private String name;
	private int age;
	private String address;
	private CheckingAsserts checks;

	@Test
	//@Ignore(value = "Don't know why it doesn't work")
	public void checkConstructor(){
		name = "Sammy";
		address = "12 Aerodrome";

		checks = new CheckingAsserts(name, address);

		assertThat(name, is(checks.getName()));
		assertThat(address, equalTo(checks.getAddress()));
		assertThat(address, containsString("12"));
	}

	@Test
	public void verifyMatcher(){
		age = 30;

		assertThat(age, equalTo(30));
		assertThat(age, is(30));

		assertThat(age, not(equalTo(33)));
		assertThat(age, is(not(33)));
	}

	@Test
	public void verifyMultipleValues(){
		double marks = 100.00;

		assertThat(marks, either(is(100.00)).or(is(90.9)));
		assertThat(marks, both(not(99.99)).and(not(60.00)));
		assertThat(marks, anyOf(is(100.00), is(1.00), is(55.00), is(88.00), is(67.8)));
		assertThat(marks, not(anyOf(is(0.00), is(200.00))));
		assertThat(marks, not(allOf(is(1.00), is(100.00), is(30.00))));
	}

	@Test
	public void verifyCollectionItems(){
		List<Double> salary = Arrays.asList(50.00, 200.00, 500.00);

		assertThat(salary, hasItem(50.00));
		assertThat(salary, hasItems(200.00, 500.00));
		assertThat(salary, not(hasItem(1.00)));
	}

	@Test
	public void verifyStringValues(){
		String name = "John Jr Dale";

		assertThat(name, startsWith("John"));
		assertThat(name, endsWith("Dale"));
		assertThat(name, containsString("Jr"));
	}

	@Test
	public void checkCustomMatcher() throws Exception{
		int actualGoalScored = 2;

		assertThat(actualGoalScored, lessThanOrEqual(4));
		assertThat(actualGoalScored, lessThanOrEqual(2));

		double originalPI = 3.14;
		assertThat(originalPI, lessThanOrEqual(9.00));

		String authorName = "Sujoy";
		assertThat(authorName, lessThanOrEqual("Zachary"));

		int maxInt = Integer.MIN_VALUE;
		assertThat(maxInt, lessThanOrEqual(Integer.MAX_VALUE));
	}

	@Test(timeout = 10)
	@Ignore("Times out the whole test")
	public void forEver() throws Exception{
		Thread.sleep(100000);
	}

}

