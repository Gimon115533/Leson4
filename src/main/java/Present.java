import Candys.Candy1;
import Candys.Candy2;
import Candys.Candy3;




public class Present {
    public static void main(String[] args) {
        double oldweight, oldprice;
        Candy1 candy11 = new Candy1("Sugar", 100, 10, "etc");
        Candy2 candy22 = new Candy2("Karamel", 200, 300, "red");
        Candy3 candy33 = new Candy3("Cookie", 500, 600, "ginger");
        candy11.setMarka("Test");
        candy22.setColor("Blue");
        candy33.setTaste("Onion");
        oldweight = candy11.getWeight() + candy22.getWeight() + candy33.getWeight();
        oldprice = candy11.getPrice() + candy22.getPrice() + candy33.getPrice();
        System.out.println("Купили; " + candy11.getName() + " марки " + candy11.getMarka() + ", " + candy22.getName());
        System.out.print(" цвета " + candy22.getColor() + ", " + candy33.getName() + " вкуса " + candy33.getTaste());
        System.out.println(" масса= " + oldweight + " общая стоимость= " + oldprice);
    }
}
