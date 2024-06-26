package edu.projectcalculateinterface.calculateinterfacespringboot.controller;

import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.MultiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultiController {
    @Autowired
    private final MultiRepository multiRepository;

    public MultiController(MultiRepository multiRepository) {
        this.multiRepository = multiRepository;
    }

    @RequestMapping(value = "mults")
    public String findAll(Model model){
        model.addAttribute("mults", multiRepository.findAll());

        return "mults";
    }
}
