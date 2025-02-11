package shop;

import java.util.ArrayList;

public class ShoppingCart {
    private int costumerId;
    private ArrayList<Product> productList = new ArrayList<>();

    ShoppingCart(int costumerId) {
        this.costumerId = costumerId;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public String getContents(){
        StringBuilder contents = new StringBuilder();
        contents.append("Conteúdos do carrinho de compras do cliente de ID " + costumerId + ":\n");

        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            contents.append(i + 1).append(" - ");
            contents.append(product.getName()).append("- R$").append(product.getPrice()).append("\n");
        }

        return contents.toString();
    }

    public int getCostumerId() {
        return costumerId;
    }

    public int getItemCount() {
        return productList.size();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        System.out.println(productList.size());
        for (int i = 0; i < productList.size(); i++) {
            totalPrice += productList.get(i).getPrice();
            System.out.println("Debugando preço: " + productList.get(i).getName());
        }
        return totalPrice;
    }
}
