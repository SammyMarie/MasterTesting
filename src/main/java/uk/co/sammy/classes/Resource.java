package uk.co.sammy.classes;

public class Resource {

    public void open(){
        System.out.println("Opened!");
    }

    public void close(){
        System.out.println("Closed");
    }

    public double get(){
        return Math.random();
    }
}