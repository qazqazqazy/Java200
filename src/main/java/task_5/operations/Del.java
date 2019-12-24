package task_5.operations;

/**
 * Created by Oksana (24/12/2019)
 */

public class Del implements anyOperation {

    public String getName() {
        return "/";
    }

    public Double cnt(Double a, Double b) {
        if(b==0)
            throw new ArithmeticException("поделили на ноль");
        return a/b;
    }
}
