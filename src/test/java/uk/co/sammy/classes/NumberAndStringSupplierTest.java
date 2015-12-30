package uk.co.sammy.classes;

import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Theories.class)
public class NumberAndStringSupplierTest {

    @Theory
    public void addsNumber(@ParametersSuppliedBy(NumberSupplier.class) Number first,
                           @ParametersSuppliedBy(NumberSupplier.class) Number second){
        Adder adds = new Adder();
        double expectedSum = first.doubleValue() +  second.doubleValue();
        double actualResult = (Double) adds.add(first, second);

        assertEquals(actualResult, expectedSum, 0.01);
        //System.out.println(first + " and " + second);
    }

    @Theory
    public void addStrings(@ParametersSuppliedBy(StringSupplier.class) String first,
                           @ParametersSuppliedBy(StringSupplier.class) String second){
        Adder adds = new Adder();
        String expectedSum = first +  second;
        String actualResult = (String) adds.add(first, second);

        assertEquals(actualResult, expectedSum);
        System.out.println(first + " and " + second);
    }
}
