package pl.sda.spring.operation;

import org.springframework.stereotype.Component;

@Component
public class DivisionOperation implements Operation {
    @Override
    public double calculate(double arg1, double arg2) {
        if (arg2 != 0) {
            return arg2 / arg1;
        } else {
            throw new RuntimeException("By 0 divison.");
        }
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DIVISION;
    }
}
