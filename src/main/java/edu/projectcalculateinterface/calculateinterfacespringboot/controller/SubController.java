package edu.projectcalculateinterface.calculateinterfacespringboot.controller;

import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.SubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubController {

    @Autowired
    private final SubRepository subRepository;

    public SubController(SubRepository subRepository) {
        this.subRepository = subRepository;
    }

    @RequestMapping(value = "/subs")
    public String findAll(Model model){
        model.addAttribute("subs", subRepository.findAll());

        return "subs";
    }
}
