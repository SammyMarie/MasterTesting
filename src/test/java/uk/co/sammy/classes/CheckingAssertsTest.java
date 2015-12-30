package uk.co.sammy.classes;

import org.junit.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CheckingAssertsTest {

    private boolean isSonarRunning = false;

    @Test
    @Ignore(value = "No Sonar running")
    public void checkSonarRunning(){
        isSonarRunning = true;
        Assume.assumeFalse(isSonarRunning);
        assertTrue(true);
    }

    @Test
    public void assertTrueAndFalseTests(){
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    public void checkAssertNotNull() throws Exception{
        String myObject = null;
        assertNull(myObject);

        myObject = "Some value";
        assertNotNull(myObject);
    }

    @Test
    public void checkAssertEquals(){
        Integer number = new Integer("5");
        Integer number2 = new Integer("5");

        assertEquals(number, number2);
    }

    @Test
    public void checkAssertNotSame(){
        Integer number = new Integer("5");
        Integer number2 = new Integer("5");

        assertNotSame(number, number2);
    }

    @Test
    public void checkAssertSame() throws Exception{
        Integer number = new Integer("5");
        Integer number2 = number;

        assertSame(number, number2);
    }

    @Test(expected = RuntimeException.class)
    public void checkException(){
        throw new RuntimeException();
    }
}