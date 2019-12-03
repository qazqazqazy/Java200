package task_4_2;

public  class JellyBean extends Elements {
    private String uniqJ;

    public JellyBean(){};

    public JellyBean(String name, int weight, int price, String uniqJ) {
        super(name, weight, price);
        this.uniqJ = uniqJ;
    }

    public String getUniqJ() {
        return uniqJ;
    }

    public void setUniqJ(String uniqJ) {
        this.uniqJ = uniqJ;
    }

    @Override
    public String toString(){
        return "JellyBean = [" + super.toString() + ", uniqJ = " + uniqJ + "]";
    }
}
