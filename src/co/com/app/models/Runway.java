package co.com.app.models;

public class Runway {
    
    private String code;
    
    private String name;
    
    private String type;
    
    private Boolean aviable;
    

    public Runway(String code, String name, String type, Boolean aviable) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.aviable = aviable;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getAviable() {
        return aviable;
    }

    public void setAviable(Boolean aviable) {
        this.aviable = aviable;
    }

    @Override
    public String toString() {
        return "Runway [code=" + code + ", name=" + name + ", type=" + type
                + ", aviable=" + aviable + "]";
    }
    
    
    
    

}
