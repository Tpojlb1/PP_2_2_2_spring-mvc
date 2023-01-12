package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
private static List<Car> cars;

public List<Car> getCars(int count) {
    cars = new ArrayList<>();
    cars.add(new Car(1, "Lada", 2001));
    cars.add(new Car(2, "BMW", 2005));
    cars.add(new Car(3, "Audi", 2010));
    cars.add(new Car(4, "Lexus", 2023));
    cars.add(new Car(5, "Kia", 2007));

    if (count > cars.size() | count < 0) {
        count = cars.size();
    }

    return cars.stream().limit(count).toList();

}
}