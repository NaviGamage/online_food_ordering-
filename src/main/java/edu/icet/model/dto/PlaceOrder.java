package edu.icet.model.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PlaceOrder {

    private Long orderId;
    private String customerName;
    private List<String> foodItemNames;
    private double totalPrice;
    private String status;
    private LocalDateTime orderDate;
}
