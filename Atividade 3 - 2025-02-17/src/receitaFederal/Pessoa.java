package receitaFederal;

public abstract class Pessoa {
    private final String nome;
    private final double rendaAnual;

    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public abstract double calcularImposto();
}
