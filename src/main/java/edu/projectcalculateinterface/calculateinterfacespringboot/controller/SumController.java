package edu.projectcalculateinterface.calculateinterfacespringboot.controller;

import edu.projectcalculateinterface.calculateinterfacespringboot.services.SumService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sum")
public class SumController {

    private final SumService sumService;

    public SumController(SumService sumService) {
        this.sumService = sumService;
    }


    @RequestMapping(method = RequestMethod.POST,
            value = "/{number1}/{number2}")
    public Double getSum(@PathVariable("number1") Double number1,
                         @PathVariable("number2") Double number2){

    }

}
