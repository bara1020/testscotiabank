package co.com.app.services;

import java.util.List;
import java.util.stream.Collectors;

import co.com.app.commons.FlightStatus;
import co.com.app.exceptions.StatusException;
import co.com.app.models.ControlTower;
import co.com.app.models.Flight;

public class FlightServiceImpl implements FlightService {

    @Override
    public List<Flight> findAllFlightsInFlight(ControlTower controlTower) {
        return controlTower.getFlights().stream()
                .filter(flight -> flight.getStatus()
                        .equals(FlightStatus.IN_FLIGHT.toString()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findAllFlihtsOnTrack(ControlTower controlTower) {
        return controlTower.getFlights().stream()
                .filter(flight -> flight.getStatus()
                        .equals(FlightStatus.ON_TRACK.toString()))
                .collect(Collectors.toList());

    }
    
    @Override
    public ControlTower changeStatusFlight(ControlTower controlTower, String code, String process) {
         controlTower.setFlights( controlTower.getFlights().stream().map(flight -> {
            if(flight.getCode().equals(code)) {
                changeStatus(flight, process);
            }
            return flight;
        }).collect(Collectors.toList()));
         return controlTower;
    }
    
    @Override
    public void addFlight(ControlTower controlTower, Flight flight) {
        controlTower.getFlights().add(flight);
    }

    
    private Flight changeStatus(Flight flight, String process) throws StatusException {
        if(flight.getStatus().equals(FlightStatus.IN_FLIGHT.getValue())) {
            if(validateStatus(flight,FlightStatus.getById(process).toString()))
                  throw  new StatusException( "You cannot execute this action because you are " + FlightStatus.IN_FLIGHT.toString());
            flight.setStatus(FlightStatus.ON_TRACK.getValue());
        }
        else {
            if(validateStatus(flight,FlightStatus.getById(process).toString()))
                throw  new StatusException( "You cannot execute this action because you are " + FlightStatus.IN_FLIGHT.toString());
            flight.setStatus(FlightStatus.IN_FLIGHT.getValue());
        }
        return flight;
    }

    private Boolean validateStatus(Flight flight, String process) {
        return flight.getStatus().equals(process);
    }

}
