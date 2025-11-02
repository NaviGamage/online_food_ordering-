package edu.icet.controller;

import edu.icet.model.dto.FoodItem;
import edu.icet.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fooditem")
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    @PostMapping("/menu")
    public FoodItem save(@RequestBody FoodItem foodItem){
        foodItemService.save(foodItem);
        return foodItem;
    }
    @GetMapping("menu1")
    public List<FoodItem>getDetails(){return foodItemService.getAlldetails();}
}
