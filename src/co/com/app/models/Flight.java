package co.com.app.models;

public class Flight {
    
    String code; 
    String origen;
    String destiny;
    Airplane airplane;
    String status;
    
    public Flight(String code, String origen, String destiny, String status, Airplane airplane) {
        this.code = code;
        this.origen = origen;
        this.destiny = destiny;
        this.status = status;
        this.airplane = airplane;
    }
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestiny() {
        return destiny;
    }
    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public String toString() {
        return "Flight [code=" + code + ", origen=" + origen + ", destiny="
                + destiny + ", airplane=" + airplane + ", status=" + status
                + "]";
    }
    
    
    

}
