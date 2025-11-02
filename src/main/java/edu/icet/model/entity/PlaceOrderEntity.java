package edu.icet.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PlaceOrderEntity {

    private Long Orerid;
    private double totalprice;
    private Date OrderDate;

    @ManyToMany(cascade = CascadeType.ALL)
    private FoodItemEntity foodItemEntity;

    @ManyToOne(cascade = CascadeType.MERGE)
    private CustomerEntity customerEntity;

}
