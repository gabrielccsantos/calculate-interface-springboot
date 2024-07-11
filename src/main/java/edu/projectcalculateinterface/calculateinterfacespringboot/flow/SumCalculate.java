package edu.projectcalculateinterface.calculateinterfacespringboot.flow;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Operation;
import edu.projectcalculateinterface.calculateinterfacespringboot.interfaces.CalculateInterface;

public class SumCalculate implements CalculateInterface {
    private Operation operation;

    public SumCalculate() {
    }

    public SumCalculate(Operation sum) {
        this.operation = sum;
    }

    @Override
    public void calculate(double number1, double number2) {
        operation.setNumber1(number1);
        operation.setNumber2(number2);
        operation.setResult(operation.getNumber1() + operation.getNumber2());
    }
}