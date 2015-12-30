package uk.co.sammy.environment;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CheckEnvironmentService {

    EnvironmentService service = new EnvironmentService();

    @Test
    public void returnNullWhenEnvironmentNotConfigured(){
        assertNull(service.getEnvironmentType("xyz"));
    }

    @Test
    public void configuredEnvironment(){
        EnvironmentType environmentType = service.getEnvironmentType("prod");
        assertThat(environmentType, is(EnvironmentType.PROD));
    }
}