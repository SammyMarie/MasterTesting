package uk.co.sammy.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by smlif on 30/12/2015.
 */
@RunWith(Parameterized.class)
public class FactorialTest {
    private int number;
    private int expectedResult;

    public FactorialTest(int input, int expected) {
        number = input;
        expectedResult = expected;
    }

    @Parameterized.Parameters(name = "factorial({0}) = {1}")
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
