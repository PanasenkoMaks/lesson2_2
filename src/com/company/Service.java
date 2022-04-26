package com.company;

public interface Service {
    void check(Car car, Bicycle bicycle, Truck truck);

    void check(Car car);

    void check(Bicycle bicycle);

    void check(Truck truck);
}
