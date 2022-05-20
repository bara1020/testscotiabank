package co.com.app.models;


public class Airplane {
    
    private String code;
    private String type;
    
    
    
    public Airplane(String code, String type) {
        super();
        this.code = code;
        this.type = type;
    }
    
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    } 
    
    public void prenderApagar(String accion) {
        System.out.println("El avion ".concat(this.code).concat(" ha pendido"));

    }
    public void volar() {
        System.out.println("El avion ".concat(this.code).concat(" ha despegado"));
    }
    
    

}
