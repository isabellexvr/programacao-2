# Tema: Listas e Composição

- Por padrão, em Java, as variáveis (atributos de uma classe) são inicializados vazios. Strings são inicializadas como null (são ponteiros), ints são inicializados como 0, etc.
- Evita-se a existência de produtos sem nome e sem preço com construtores, que tornam orbigatória a inicialização desses valores.

```Java
public class Product{
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Product product = new Product("biscoito", 19,25, 10);
    }
}
```

## Sobrecarga
    Uma classe pode oferecer mais de um método com o mesmo nome, porém com diferentes parâmetros.

- Os métodos sobrecarregados devem divergir em, pelo menos, um dos seguintes aspectos: quantidade de parâmetros, tipos dos parâmetros ou ordem dos parâmetros.

```Java
public class Calculadora{

    int somar(int a, int b){
        return a+b;
    }

    int somar(int a, int b, int c){
        return a + b + c;
    }

    double somar(double a, double b) {
        return a + b;
    }

    void imprimir(String texto, int numero) {
        System.out.println(texto + " " + numero);
    }

    // parâmetros na ordem número depois texto
    void imprimir(int numero, String texto) {
        System.out.println(numero + " " + texto);
    }    
}

public class Product{
    public Product(float price, String name){
		this.price = price;
		this.name = name;
	}
    // para caso a instanciação não passe o price
	public Product(String name){
		this(10, name);
	}
}
```

## Encapsulamento
    Esconde detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente; i.é, a classe deve manter a consistência de uma instância.
- Em suma, verificar casos de erro e regras de negócio usando modificadores de acesso e métodos que façam sentido para a aplicação.
- Um objeto NÃO deve expor nenhum atributo (modificador de acesso private).


```Java
    private String name;
    private double price;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
```

## Modificadores de Acesso

- Default (vazio): o membro só pode ser acessado nas classes do mesmo pacote
- private: o membro só pode ser acessado na própria classe
- protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
- public: o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está)

## Listas

- Armazenam dados do mesmo tipo, ordenada, inicializada vazia e adiciona-se elementos via demanda, cada elemento ocupa um nó da lista, tamanho variável.

### ArrayList:
- Uma array que aumenta e diminui dinamicamente de tamanho conforme aloca e desaloca espaço na RAM -> bom pra acessos aleatórios.

    The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

### LinkedList:
- Lista encadeada de fato -> bom para percorrer a lista.
    The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.


### Métodos em comum:
- size()
- get(position)
- add(obj), add(int, obj)
- remove(obj), remove(int)
- indexOf(obj), lastIndexOf(obj)

```Java
import java.util.ArrayList;
import java.util.LinkedList;

public class Exemplo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
    }
}
```

# Composição:
    É um tipo de associação que permite que um objeto contenha outro.

- Relação "tem-um" ou "tem-vários"
- Vantagens
    - Organização: divisão de responsabilidades
    - Coesão
    - Flexibilidade
    - Reuso

