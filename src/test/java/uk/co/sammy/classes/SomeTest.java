package uk.co.sammy.classes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import uk.co.sammy.interfaces.CrazyTests;

import static org.junit.Assert.fail;

public class SomeTest {

    @Test
    public void ace(){
        fail();
    }

    @Category(CrazyTests.class)
    @Test
    public void base(){

    }
}
