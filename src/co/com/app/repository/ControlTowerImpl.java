package co.com.app.repository;

import java.util.ArrayList;

import co.com.app.models.ControlTower;

public class ControlTowerImpl implements ControlTowerService {



    @Override
    public ControlTower getControlTower() {
        return new ControlTower(new ArrayList<>(), new ArrayList<>());
    }

}
