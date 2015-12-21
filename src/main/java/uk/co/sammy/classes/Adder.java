package uk.co.sammy.classes;

/**
 * Created by smlif on 21/12/2015.
 */
public class Adder {
    public Object add(Number first, Number second){
        return first.doubleValue() + second.doubleValue();
    }

    public Object add(String first, String second){
        return first + second;
    }
}
