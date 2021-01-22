package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import com.example.demo.repository.ISupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    private IStudentRepository iStudentRepository;
    @Autowired
    private ISupervisorRepository iSupervisorRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("studentsToReturn", iStudentRepository.findAll());
        return "index";
    }

    //Create student
    @GetMapping("/create-student")
    public String createStudent(Model model){
        Student student = new Student();
        model.addAttribute("studentToBeInserted", student);
        model.addAttribute("selectSupervisor", iSupervisorRepository.findAll());
        return "create-student";
    }

    //Saves the created student
    @PostMapping("/create-student")
    public String createdStudent(@ModelAttribute Student newStudent){
        iStudentRepository.save(newStudent);
        return "successful";
    }

    @GetMapping("/edit-student/{id}")
    public String editStudent(@PathVariable("id") Long id, Model model){
        Optional<Student> student = iStudentRepository.findById(id);

        model.addAttribute("selectSupervisor", iSupervisorRepository.findAll());
        model.addAttribute("studentToBeUpdated",iStudentRepository.findById(id));
        iStudentRepository.deleteById(student.get().getId());

        return "edit-student";
    }
    @PostMapping("/edit-student")
    public String studentUpdated(@ModelAttribute Student StudentToBeUpdated){

        iStudentRepository.save(StudentToBeUpdated);

        return "successful";
    }

    //Deletes student by id
    @GetMapping("/delete-student/{id}")
    private String deleteStudent(@PathVariable("id") Long id){
        Optional<Student> student = iStudentRepository.findById(id);

        iStudentRepository.deleteById(student.get().getId());

        return "successful";
    }
}