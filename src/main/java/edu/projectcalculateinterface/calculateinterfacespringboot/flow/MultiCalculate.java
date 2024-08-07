package edu.projectcalculateinterface.calculateinterfacespringboot.flow;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Operation;
import edu.projectcalculateinterface.calculateinterfacespringboot.interfaces.CalculateInterface;

public class MultiCalculate implements CalculateInterface {
    private Operation operation;

    public MultiCalculate() {
    }

    public MultiCalculate(Operation multi) {
        this.operation = multi;
    }

    @Override
    public void calculate(double number1, double number2) {
        operation.setNumber1(number1);
        operation.setNumber2(number2);
        operation.setResult(operation.getNumber1() * operation.getNumber2());
    }
}
