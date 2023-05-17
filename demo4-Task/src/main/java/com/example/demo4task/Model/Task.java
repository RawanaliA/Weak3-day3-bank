package com.example.demo4task.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
    private String id;
    private String title;
    private String descreption;
    private String status;
}
