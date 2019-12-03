package task_4_2;

public class Candy extends Elements {

    private String sizeC;

    public Candy(String name, int weight, int price, String sizeC) {
        super(name, weight, price);
        this.sizeC = sizeC;
    }

    public String getSizeC() {
        return sizeC;
    }

    public void setSizeC(String sizeC) {
        this.sizeC = sizeC;
    }

    @Override
    public String toString(){
        return "Candy = [" + super.toString() + ", typeB = " + sizeC + "]";
    }

}
