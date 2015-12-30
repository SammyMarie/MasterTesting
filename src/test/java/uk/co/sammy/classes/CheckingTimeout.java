package uk.co.sammy.classes;

import org.junit.*;
import org.junit.rules.Timeout;

public class CheckingTimeout {

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Test
    public void checkInfiniteLoop1() throws InterruptedException{
        Thread.sleep(30);
    }

    @Test
    public void checkInfiniteLoop2() throws InterruptedException{
        Thread.sleep(30);
    }
}
