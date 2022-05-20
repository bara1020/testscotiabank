package co.com.app.services;

import java.util.List;

import co.com.app.models.ControlTower;
import co.com.app.models.Flight;

public interface FlightService {


    List<Flight> findAllFlightsInFlight(ControlTower controlTower);

    List<Flight> findAllFlihtsOnTrack(ControlTower controlTower);

    ControlTower changeStatusFlight(ControlTower controlTower, String code, String process);

    void addFlight(ControlTower controlTower, Flight flight);

}
