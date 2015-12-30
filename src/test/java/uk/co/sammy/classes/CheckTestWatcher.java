package uk.co.sammy.classes;

<<<<<<< HEAD
import org.junit.FixMethodOrder;
import org.junit.*;
=======
import org.junit.AfterClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
>>>>>>> b2cb363d7067e6e92d8ab6222f218929c78852f9
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.junit.runners.model.Statement;

<<<<<<< HEAD
import static org.junit.Assert.fail;

=======
import static org.junit.Assert.*;

/**
 * Created by smlif on 21/12/2015.
 */
>>>>>>> b2cb363d7067e6e92d8ab6222f218929c78852f9
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CheckTestWatcher {

    private static String dog = "";

    @Rule
    public TestWatcher watcher = new TestWatcher() {
        @Override
        public Statement apply(Statement base, Description description){
            return super.apply(base, description);
        }

        @Override
        protected void succeeded(Description description) {
            dog += description.getDisplayName() + " " + "success!\n";
        }

        @Override
        public void failed(Throwable trow, Description description){
            dog += description.getDisplayName() + " " + trow.getClass().getSimpleName() + "\n";
        }

        @Override
        protected void starting(Description description){
            super.starting(description);
        }

        @Override
        protected void finished(Description description){
            super.finished(description);
        }
    };

    @Test
    public void redTest(){
        fail();
    }

    @Test
    public void green(){

    }

    @AfterClass
    public static void afterClass(){
        System.out.println(dog);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> b2cb363d7067e6e92d8ab6222f218929c78852f9
