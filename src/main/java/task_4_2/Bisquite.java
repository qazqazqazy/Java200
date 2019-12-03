package task_4_2;

public class Bisquite extends Elements {

    private int typeB;

    public Bisquite(String name, int weight, int price, int typeB) {
        super(name, weight, price);
        this.typeB = typeB;
    }

    public int getTypeB() {
        return typeB;
    }

    public void setTypeB(int typeB) {
        this.typeB = typeB;
    }

    @Override
    public String toString(){
        return "Bisquite = [" + super.toString() + ", typeB = " + typeB + "]";
    }

}
