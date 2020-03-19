package by.epam.carrental.dao;

import by.epam.carrental.entity.Order;

public class OrderController extends Controller<Order, String> {
    private static final String dir = "data/order.dat";

    @Override
    public String getDir(){
        return dir;
    }
}
