package by.epam.carrental.dao;

import by.epam.carrental.entity.Car;

public class CarController extends Controller<Car, String> {
    private static final String dir = "data/car.dat";

    @Override
    public String getDir(){
        return dir;
    }
}
