package newShop;

public class Main {
    public static void main(String[] args) {
        ShoppingCart carrinhoDaCreuza = new ShoppingCart(1);
        ShoppingCart carrinhoDoPaulo = new ShoppingCart(2);

        TV TelevisaoLG = new TV("LG", 4000.00, 43);
        TV TelevisaoSamsung = new TV("Samsung", 3000.00, 45);
        Stove FogaoFischer = new Stove("Fischer", 1000.00, 5);
        Stove FogaoEsmaltec = new Stove("Esmaltec", 993.00, 5);
        Refrigerator GeladeiraLG = new Refrigerator("LG", 4000.00, 43);
        Refrigerator GeladeiraBrastemp = new Refrigerator("Brastemp", 3000.00, 40);

        carrinhoDaCreuza.addProduct(TelevisaoLG);
        carrinhoDaCreuza.addProduct(FogaoEsmaltec);
        System.out.println("Preço total do carrinho da Creuza: " + carrinhoDaCreuza.getTotalPrice());
        carrinhoDaCreuza.addProduct(FogaoFischer);
        carrinhoDaCreuza.removeProduct(FogaoEsmaltec);
        carrinhoDaCreuza.getContents();
        System.out.println("Agora, Creuza tem " + carrinhoDaCreuza.getItemCount() + " item(s)");

    }
}
