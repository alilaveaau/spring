package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BatMobile", "Black", 1941));
        cars.add(new Car("Impala", "Black", 1967));
        cars.add(new Car("MysteryCar", "MultiCar", 1968));
        cars.add(new Car("CadillacMillerMeteor", "White", 1959));
        cars.add(new Car("DeLoreanDMC12", "Red", 1981));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count < 0 || count >= cars.size()) {
            return cars;
        } else return cars.subList(0, count);
    }
}
