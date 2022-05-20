package co.com.app.commons;

public enum RunwayType {
    TO_LAND("To land"),  
    TO_TAKE_OFF("To take off");


    private final String runwayType;

    RunwayType(String runwayType) {
        this.runwayType = runwayType;
    }
    
    public String getValue() {
        return this.runwayType;
    }
}
