package uk.co.sammy.classes;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/**
 * Created by smlif on 30/12/2015.
 */
public class LessThanOrEqual<T extends Comparable<T>> extends BaseMatcher<Comparable<T>> {

    private final Comparable<T> expectedValue;

    public LessThanOrEqual(T expectedValue) {

        this.expectedValue = expectedValue;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("less than or equal (<=) " + expectedValue);
    }

    @Override
    public boolean matches(Object item) {
        int compareTo = expectedValue.compareTo((T) item);
        return compareTo > -1;
    }

    @Factory
    public static<T extends Comparable<T>> Matcher<T> lessThanOrEqual(T value){

        return new LessThanOrEqual(value);
    }
}
