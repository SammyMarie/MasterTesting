package uk.co.sammy.classes;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

<<<<<<< HEAD
=======
/**
 * Created by smlif on 21/12/2015.
 */
>>>>>>> b2cb363d7067e6e92d8ab6222f218929c78852f9
@RunWith(Theories.class)
public class CheckingJunitTheories {

    @DataPoint
    public static String jack = "Jack";

    @DataPoint
    public static String mike = "Michael";

    @DataPoints
    public static char[] letters = new char[]{'A', 'B', 'C'};

    @Theory
    public void sanity(String firstName, String lastName){
        System.out.println("Sanity check " + firstName + " " + lastName);
    }

    @Theory
    public void build(char c, char d){
        System.out.println(c + " " + d);
    }
}
