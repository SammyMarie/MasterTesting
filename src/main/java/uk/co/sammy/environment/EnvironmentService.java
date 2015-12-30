package uk.co.sammy.environment;

public class EnvironmentService {

    public EnvironmentType getEnvironmentType(){
        return getEnvironmentType(new Environment().getName());
    }

    public EnvironmentType getEnvironmentType(String name) {

        switch (name){
            case "dev":
                return EnvironmentType.DEV;

            case "prod":
                return EnvironmentType.PROD;

            case "test":
                return EnvironmentType.TEST;

            default:
                return null;
        }
    }
}