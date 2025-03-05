# Casting
## Upcasting
  - Converter um objeto de uma subclasse para uma superclasse. A subclasse herda todos os atributos e métodos da superclasse.
  - Quer-se tratar objetos de forma genérica

  ```Java
class Animal {
    void fazerSom() {
        System.out.println("Animal fazendo som");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Au Au!");
    }
}

public class bank.Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.fazerSom(); // Saída: Au Au!
    }
}
  ```

## Downcasting
- Converter objeto da superclasse para subclasse.
- Útil para acessar funcionalidades específicas da subclasse.

```Java
class Animal {
    void fazerSom() {
        System.out.println("Animal fazendo som");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Au Au!");
    }

    void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }
}

public class bank.Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            cachorro.abanarRabo();
        }
    }
}
```
