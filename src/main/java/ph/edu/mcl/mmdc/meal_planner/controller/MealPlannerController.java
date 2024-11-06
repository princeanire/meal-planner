package ph.edu.mcl.mmdc.meal_planner.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MealPlannerController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World! Good Luck Learning Spring!";
    }
}