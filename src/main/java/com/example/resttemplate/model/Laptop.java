package com.example.resttemplate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    private int id;
    private String laptopName;
    private String laptopPrice;
    private String studentId;
}
