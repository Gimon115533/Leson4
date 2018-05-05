package Candys;

public class Candy3 extends Candy {
    private String taste;// = "ginger";

    public Candy3(String name, double weight, double price, String ginger) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return taste + super.toString();
    }
}
