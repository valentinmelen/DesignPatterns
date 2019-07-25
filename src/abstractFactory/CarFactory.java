package abstractFactory;

import abstractFactory.Car.Car;

public abstract class CarFactory {
    public abstract Car createCar(Integer engineSize);

}
