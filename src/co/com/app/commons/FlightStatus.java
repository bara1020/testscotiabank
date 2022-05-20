package co.com.app.commons;

public enum FlightStatus {
    IN_FLIGHT("1","In Flight"),  
    ON_TRACK("2","On Track");


    private final String value;
    private final String code;


    FlightStatus(String code, String value) {
        this.code = code;
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public static FlightStatus getById(String id) {
        for(FlightStatus e : values()) {
            if(e.getCode().equals(id)) return e;
        }
        return null;
    }
}
