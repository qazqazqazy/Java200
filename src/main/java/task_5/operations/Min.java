package task_5.operations;

public class Min implements AnyOp {

    public String getName() {
        return "-";
    }
    public Double result(Double a, Double b) {
        return a - b;
    }
}