package com.example.demo.controller;

import com.example.demo.repository.ISupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupervisorController {
    @Autowired
    private ISupervisorRepository iSupervisorRepository;

    @GetMapping("/supervisors")
    public String allSupervisors(Model model){
        model.addAttribute("supervisorsToBeReturned",iSupervisorRepository.findAll());

        return "supervisors";
    }
}
