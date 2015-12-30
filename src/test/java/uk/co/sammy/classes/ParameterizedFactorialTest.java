package uk.co.sammy.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParameterizedFactorialTest {
    @Parameter(value = 0)
    public int number;

    @Parameter(value = 1)
    public int expectedResult;

    @Parameters(name = "factorial({0}) = {1}")
    public static Collection<Object[]> factorialData() {
        return Arrays.asList(new Object[][]{
                {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}
        });
    }

    @Test
    public void factorial() {
        Factorial facts = new Factorial();
        assertThat(facts.factorial(number), equalTo(expectedResult));
    }
}
