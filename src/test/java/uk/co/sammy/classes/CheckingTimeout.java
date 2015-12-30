package uk.co.sammy.classes;

<<<<<<< HEAD
import org.junit.*;
import org.junit.rules.Timeout;

=======
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * Created by smlif on 21/12/2015.
 */
>>>>>>> b2cb363d7067e6e92d8ab6222f218929c78852f9
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
