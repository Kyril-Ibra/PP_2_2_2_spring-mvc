package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarServiceImpl;


@Controller
@RequestMapping("/")
public class CarController {

    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "cars")
    public String getCarList(@RequestParam(value = "count", required = false) Integer count, Model model) {
            model.addAttribute("cars", carService.getCarList(count));
        return "cars";
    }
}
