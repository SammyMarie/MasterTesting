package uk.co.sammy.classes;

import org.junit.*;
import org.junit.rules.TestName;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class CheckTestName {

    @Rule
    public TestName name = new TestName();

    @Test
    public void checkA(){
        assertThat("checkA", equalTo(name.getMethodName()));
    }

    @Test
    public void checkB(){
        assertThat("checkB", equalTo(name.getMethodName()));
    }
}
