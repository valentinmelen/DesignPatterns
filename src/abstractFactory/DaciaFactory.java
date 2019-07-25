package abstractFactory;

import abstractFactory.Car.Car;
import abstractFactory.Car.Duster;
import abstractFactory.Car.Logan;
import abstractFactory.Car.Sandero;

public class DaciaFactory extends CarFactory {

    public Car createCar(Integer engineSize) {

        switch (engineSize) {
            case 1200:
                return new Sandero(engineSize);
            case 1600:
                return new Logan(engineSize);
            case 2000:
                return new Duster(engineSize);
            default:
                return null;
        }
    }
}
