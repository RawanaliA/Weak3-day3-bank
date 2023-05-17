package com.example.demo4bankhw.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Custemer {
    private String id;
    public String username;
    private int balance;
}
