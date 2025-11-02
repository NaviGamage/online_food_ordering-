package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodItem {

    private Long id;
    private String name;
    private String description;
    private double price;
    private boolean available;
}
