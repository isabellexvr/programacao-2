package newShop;

public class TV extends Product {
    private int inches;

    TV(String brand, double price, int inches) {
        super(brand, price);
        this.inches = inches;
    }

    public int getInches() {
        return this.inches;
    }
}
