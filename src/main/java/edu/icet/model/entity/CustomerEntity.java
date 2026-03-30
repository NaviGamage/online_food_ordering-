package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class CustomerEntity {

    @Id
    private String customerid;
    private String name;
    private String email;
    private String phone;
    private String address;
}
