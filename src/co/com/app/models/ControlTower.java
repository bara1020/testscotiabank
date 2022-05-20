package co.com.app.models;

import java.util.Arrays;
import java.util.List;

import co.com.app.commons.RunwayType;

public class ControlTower {

    List<Runway> runways;

    List<Flight> flights;

    public ControlTower(List<Runway> runways, List<Flight> flights) {

        if (flights.isEmpty()) {
            this.flights  = Arrays.asList(
                    new Flight("001", "Bogot�", "Medell�n", "In Flight",
                            new Airplane("001", "Avi�n")),
                    new Flight("002", "Cartagena", "Medell�n", "In Flight",
                            new Airplane("001", "Avioneta")),
                    new Flight("003", "Bucaramanga", "Medell�n", "In Flight",
                            new Airplane("001", "Avion")),
                    new Flight("004", "Bogot�", "Medell�n", "On track",
                            new Airplane("001", "Avi�n")),
                    new Flight("005", "Cartagena", "Medell�n", "On track",
                            new Airplane("001", "Avioneta")),
                    new Flight("006", "Bucaramanga", "Medell�n", "On track",
                            new Airplane("001", "Avion")));

        }
        
        if(runways.isEmpty()) {
           this.runways =  Arrays.asList(
                    new Runway("001","Pista llegada",RunwayType.TO_LAND.getValue(),true),
                    new Runway("002","Pista Salida",RunwayType.TO_TAKE_OFF.getValue(),true)
                    );

        }

    }

    public List<Runway> getRunways() {
        return runways;
    }

    public void setRunways(List<Runway> runways) {
        this.runways = runways;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

}
