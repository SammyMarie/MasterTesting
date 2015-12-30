package uk.co.sammy.classes;

public class Adder {
    public Object add(Number first, Number second){
        return first.doubleValue() + second.doubleValue();
    }

    public Object add(String first, String second){
        return first + second;
    }
}