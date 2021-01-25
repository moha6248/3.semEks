package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    Student student; //declaring

    @InjectMocks // creates objects and inject mocked dependencies
    StudentController studentController;

    @Mock //To create mock object for IStudentRepository dependency instead of calling the real Repository

    IStudentRepository iStudentRepository;


    @BeforeEach
    void setUp() {
        student = new Student(); //instanciating
    }

    @Test
    void createStudent() {
        Assertions.assertEquals("successful",studentController.createdStudent(student));

    }
}