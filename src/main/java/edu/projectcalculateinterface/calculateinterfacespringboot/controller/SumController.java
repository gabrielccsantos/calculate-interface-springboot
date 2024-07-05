package edu.projectcalculateinterface.calculateinterfacespringboot.controller;

import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.SumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @Autowired
    private final SumRepository sumRepository;

    public SumController(SumRepository sumRepository) {
        this.sumRepository = sumRepository;
    }

    @RequestMapping(value = "/sums", method = RequestMethod.GET)
    public String findAll(Model model){
        model.addAttribute("sums", sumRepository.findAll());

        return "sums";
    }
}
