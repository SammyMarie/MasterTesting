package uk.co.sammy.classes;


import org.junit.*;
import org.junit.rules.*;
import java.io.File;
import java.io.IOException;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by smlif on 21/12/2015.
 */

public class CheckJunitRules {

    private String errorMsg = null;

    @Rule
    public TestRule rule = new Verifier(){
        protected void verify(){
            assertNull("ErrorMsg should be null after each test execution", errorMsg);
        }
    };

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Rule
    public ErrorCollector collect = new ErrorCollector();

    @Test
    public void checkName() throws Exception{
        errorMsg = "Giving a value";
    }

    @Test
    public void failAfterExecution(){
        collect.checkThat("a", equalTo("b"));
        collect.checkThat(1, equalTo(2));
        collect.checkThat("ae", equalTo("g"));
    }

    @Test
    public void checkTempFolderUse() throws IOException {
        File createdFile = folder.newFile("myfile.txt");
        File createdFolder = folder.newFolder("mysubFolder");
    }

    @Test
    public void throwsNothing(){

    }

    @Test
    public void throwsNullPointerException(){
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }

    @Test
    @Ignore(value = "Exceptions do not have default messages!")
    public void throwsIllegalStateException(){
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Is this a legal state?");
        throw new IllegalStateException();
    }

}


