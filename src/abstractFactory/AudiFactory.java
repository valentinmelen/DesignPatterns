package abstractFactory;

import abstractFactory.Car.A1;
import abstractFactory.Car.A4;
import abstractFactory.Car.Car;
import abstractFactory.Car.TT;

public class AudiFactory extends CarFactory {
    @Override
    public Car createCar(Integer engineSize) {
        switch (engineSize) {
            case 1200:
                return new A1(engineSize);
            case 1600:
                return new A4(engineSize);
            case 2000:
                return new TT(engineSize);
            default:
                return null;
        }
    }
}
