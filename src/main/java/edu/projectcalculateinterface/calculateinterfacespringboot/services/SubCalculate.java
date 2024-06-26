package edu.projectcalculateinterface.calculateinterfacespringboot.services;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Operation;
import edu.projectcalculateinterface.calculateinterfacespringboot.interfaces.CalculateInterface;
import org.springframework.stereotype.Service;

@Service
public class SubCalculate implements CalculateInterface{

    private Operation operation;

    public SubCalculate() {
    }

    public SubCalculate(Operation sub) {
        this.operation = sub;
    }

    @Override
    public void calculate(double number1, double number2) {
        operation.setNumber1(number1);
        operation.setNumber2(number2);
        operation.setResult(operation.getNumber1() - operation.getNumber2());
    }
}