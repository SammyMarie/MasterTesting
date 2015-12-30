package uk.co.sammy.classes;

import org.junit.*;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestName;

public class CheckingExternalResources {
    private Resource resource;

    @Rule
    public TestName name = new TestName();

    @Rule
    public ExternalResource rule = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            resource = new Resource();
            resource.open();
            System.out.println(name.getMethodName());
        }

        @Override
        protected void after() {
            resource.close();
        }
    };

    @Test
    public void someTest() throws Exception{
        System.out.println(resource.get());
    }

    @Test
    public void someTest2() throws Exception{
        System.out.println(resource.get());
    }
}