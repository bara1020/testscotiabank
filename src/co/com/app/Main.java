package co.com.app;

import java.util.Scanner;

import co.com.app.exceptions.StatusException;
import co.com.app.models.ControlTower;
import co.com.app.repository.ControlTowerImpl;
import co.com.app.repository.ControlTowerService;
import co.com.app.services.FlightService;
import co.com.app.services.FlightServiceImpl;
import co.com.app.utils.AppConstants;

public class Main {

    public static void main(String[] args) {
        ControlTowerService controlTowerService = new ControlTowerImpl();
        FlightService flightService = new FlightServiceImpl();
        String response;
        ControlTower controlTower = controlTowerService.getControlTower();
        Scanner sc = null;
        try {
            do {
                sc = new Scanner(System.in);
                System.out.println(AppConstants.SEPARATOR_LINES);
                System.out.println(AppConstants.QUESTION);
                System.out.println(AppConstants.FIRST_OPTION);
                System.out.println(AppConstants.SECOND_OPTION);
                System.out.println(AppConstants.THIRTH_OPTION);
                System.out.println(AppConstants.FOURTH_OPTION);
                System.out.println(AppConstants.INSTRUCTION);
                response = sc.nextLine();
                handler(sc, flightService, controlTower, response);
            } while (!response.equals(AppConstants.CUATRO));
            System.out.println(AppConstants.END_SYSTEM);
            sc.close();

        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
            sc.close();
        }

    }

    private static void handler(Scanner sc, FlightService flightService,
            ControlTower controlTower, String response) {
        String process = response;
        if (response.equals(AppConstants.UNO) || response.equals(AppConstants.DOS)) {
            System.out.println(AppConstants.INSTRUCTION_FLIGHT_CODE);
            response = sc.nextLine();
            try {
                controlTower = flightService.changeStatusFlight(controlTower,
                        response,process);
            } catch (StatusException e) {
                System.out.println(e.getMessage());
            }

        } else if (response.equals(AppConstants.TRES)) {
            controlTower.getFlights().forEach(System.out::println);
        } else {
            System.out.println(AppConstants.INVALID_OPTION);
        }

    }

}
