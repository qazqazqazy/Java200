package task_5.operations;

/**
 * Created by Oksana (24/12/2019)
 */

public class Mult implements anyOperation {

    public String getName() {
        return "*";
    }

    public Double cnt(Double a, Double b) {
        return a*b;
    }
}
