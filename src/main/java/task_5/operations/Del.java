package task_5.operations;

public class Del implements AnyOp  {

    public String getName() {
        return "/";
    }

    public Double result(Double a, Double b) {
        if(b==0) throw new ArithmeticException("На 0 делить нельзя");
        return a/b;
    }
}
