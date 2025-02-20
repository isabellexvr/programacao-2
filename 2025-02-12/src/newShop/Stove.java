package newShop;

public class Stove extends Product {
    private int burners;
    Stove(String name, double price, int burners) {
        super(name, price);
        this.burners = burners;
    }

    public int getBurners() {
        return this.burners;
    }
}