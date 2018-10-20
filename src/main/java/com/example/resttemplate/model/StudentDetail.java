package com.example.resttemplate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetail {
    private int studentId;
    private String studentName;
    private String studentLastName;
    private String student_email;
}
