package Candys;
public class Candy1 extends Candy {
    private String marka;// = "etc";
    public Candy1 (){}

    public Candy1(String name, double weight, double price, String etc) {
        super(name, weight, price);
        this.marka=marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return marka+ super.toString();
    }
}
