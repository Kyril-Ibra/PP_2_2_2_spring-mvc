package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private static int car_count;
    private final List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car(++car_count, "BMW", 5));
        car.add(new Car(++car_count, "BMW", 3));
        car.add(new Car(++car_count, "Rolls Royce", 2));
        car.add(new Car(++car_count, "Tesla", 3));
        car.add(new Car(++car_count, "Porsche", 900));
    }

    public List<Car> getCarList(Integer count) {
        if (count != null) {
            return car.stream().limit(count).toList();
       } else return car;
        }
    }


