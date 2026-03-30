package edu.icet.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PlaceOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Orerid;
    private double totalprice;
    private LocalDateTime OrderDate;

    @ManyToMany(cascade = CascadeType.ALL)
    private FoodItemEntity foodItemEntity;

    @ManyToOne(cascade = CascadeType.MERGE)
    private CustomerEntity customerEntity;

}
