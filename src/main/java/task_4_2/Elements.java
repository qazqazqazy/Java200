package task_4_2;

public abstract class Elements {
    private String name;
    private int weight;
    private int price;

    public Elements() {}

    public Elements(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameJ) {
        this.name = nameJ;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public String toString(){
        return "name = " + name + ", weight = " + weight + " g, price = " + price;
    }

}
