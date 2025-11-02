package edu.icet.model.entity;

import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerEntity {

    @Id
    private String userid;
    private String name;
    private String email;
    private String phone;
    private String address;
}
