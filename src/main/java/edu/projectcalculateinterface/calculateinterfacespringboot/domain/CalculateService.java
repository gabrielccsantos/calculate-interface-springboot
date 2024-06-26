package edu.projectcalculateinterface.calculateinterfacespringboot.domain;

import edu.projectcalculateinterface.calculateinterfacespringboot.interfaces.CalculateInterface;



public class CalculateService {

    private CalculateInterface calculateInterface;

    public CalculateService(CalculateInterface calculateInterface){
        this.calculateInterface = calculateInterface;
    }

    public void calculate(Double number1, Double number2){
        calculateInterface.calculate(number1, number2);
    }

}
