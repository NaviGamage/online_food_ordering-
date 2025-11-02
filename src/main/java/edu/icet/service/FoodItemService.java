package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.dto.FoodItem;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.model.entity.FoodItemEntity;
import edu.icet.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FoodItemService {

    @Autowired
    FoodItemRepository foodItemRepository;

    public void save(FoodItem foodItem) {

        FoodItemEntity foodItemEntity = new FoodItemEntity(
                foodItem.getId(),
                foodItem.getName(),
                foodItem.getDescription(),
                foodItem.getPrice()

        );
        foodItemRepository.save(foodItemEntity);
    }

    public List<FoodItem> getAlldetails() {

        List<FoodItemEntity> foodItemEntities = foodItemRepository.findAll();
        List<FoodItem> foodItems = new ArrayList<>();

        for (FoodItemEntity foodItemEntity : foodItemEntities) {
            foodItems.add(new FoodItem(

                            foodItemEntity.getId(),
                            foodItemEntity.getName(),
                            foodItemEntity.getDescription(),
                            foodItemEntity.getPrice()
                    )
            );
        }
        return foodItems;
    }
}

