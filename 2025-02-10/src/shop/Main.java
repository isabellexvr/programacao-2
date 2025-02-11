package shop;

public class Main {
    public static void main(String[] args) {
        ShoppingCart carrinhoDoFulano = new ShoppingCart(1);
        ShoppingCart carrinhoDoSicrano = new ShoppingCart(2);

        Product agua =  new Product("agua", 5);
        Product neosaldina = new Product("neosaldina", 10);
        Product tecladoRGB = new Product("teclado rgb", 150);
        Product samsungRGB = new Product("samsung rgb", 200);
        Product melao = new Product("melao", 1.9);
        Product lenha =  new Product("lenha", 20);

        System.out.println("ID do cliente: " + carrinhoDoFulano.getCostumerId());
        carrinhoDoFulano.addProduct(agua);
        carrinhoDoFulano.addProduct(neosaldina);
        carrinhoDoFulano.addProduct(tecladoRGB);
        System.out.println(carrinhoDoFulano.getItemCount());
        carrinhoDoFulano.removeProduct(tecladoRGB);
        System.out.println(carrinhoDoFulano.getItemCount());
        carrinhoDoFulano.removeProduct(samsungRGB);
        System.out.println(carrinhoDoFulano.getContents());
        System.out.println("Preço total do carrinho de Fulano: " + carrinhoDoFulano.getTotalPrice());

        carrinhoDoSicrano.addProduct(agua);
        carrinhoDoSicrano.addProduct(tecladoRGB);
        carrinhoDoSicrano.addProduct(melao);
        carrinhoDoSicrano.addProduct(lenha);
        System.out.println(carrinhoDoSicrano.getTotalPrice());

    }
}