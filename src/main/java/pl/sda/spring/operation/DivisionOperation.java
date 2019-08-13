package pl.sda.spring.operation;

//Bean declaration in DivisionOperationConfiguration.java
public class DivisionOperation implements Operation {

  private String message;
    public DivisionOperation(String message) {
        this.message=message;

    }

    @Override
    public double calculate(double arg1, double arg2) {
        if (arg2 != 0) {
            return arg2 / arg1;
        } else {
            throw new RuntimeException(message);
        }
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DIVISION;
    }
}
