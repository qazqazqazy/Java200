import task_4_2.Bisquite;
import task_4_2.Candy;
import task_4_2.Elements;
import task_4_2.JellyBean;

public class Base1 {

    public static void main(String[] args) {

        Candy candy1 = new Candy("Bears",200, 100, "big");
        JellyBean jel1 = new JellyBean("Blueberry", 100, 95, "USA");
        JellyBean jel2 = new JellyBean();
        jel2.setUniqJ("Russia");
        jel2.setName("Strawberry");
        jel2.setPrice(80);
        jel2.setWeight(70);
        Bisquite bisq = new Bisquite("Pie",150,120,1 );
        Elements [] gift =  {candy1,jel1,jel2, bisq};

        System.out.println("Состав подарка: ");

        for (Elements el:gift ) {
            System.out.println(el.toString());
            }
        //int can1Price = candy1.getPrice();
        //System.out.println("Цена candy1: " + can1Price);

        int totalWeight = candy1.getWeight() + jel1.getWeight() + jel2.getWeight() + bisq.getWeight();
        System.out.println("Общий вес подарка: " + totalWeight + " g");

        int totalPrice = candy1.getPrice() + jel1.getPrice() + jel2.getPrice() + bisq.getPrice();
        System.out.println("Общая стоимость подарка: " + totalPrice + " rub.");




    }


    }


