package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private static int CAR_COUNT;
    private  List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car(++CAR_COUNT, "BMW", 5));
        car.add(new Car(++CAR_COUNT, "BMW", 3));
        car.add(new Car(++CAR_COUNT, "Rolls Royce", 2));
        car.add(new Car(++CAR_COUNT, "Tesla", 3));
        car.add(new Car(++CAR_COUNT, "Porsche", 900));
    }

    public List<Car> getCarList(Integer count) {
        if (count != null) {
            return car.stream().limit(count).toList();
       } else return car;
        }
    }


