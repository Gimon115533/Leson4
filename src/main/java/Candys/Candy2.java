package Candys;

public class Candy2 extends Candy {
    private String color;// = "red";

    public Candy2(String name, double weight, double price, String red) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + super.toString();
    }
}
