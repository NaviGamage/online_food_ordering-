package edu.icet.model.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Customer {

        private String customerid;
        private String name;
        private String email;
        private String phone;
        private String address;
   }


