package receitaFederal;

public class PessoaFisica extends Pessoa {
    private double gastosComSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public double getGastosComSaude() {
        return this.gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    public double calcularImposto() {
        double imposto;
        if(this.getRendaAnual() < 20000.0){
            imposto = this.getRendaAnual() * 0.15;
        }else{
            imposto = this.getRendaAnual() * 0.25;
        }

        if(this.gastosComSaude > 0){
            imposto -= this.gastosComSaude * 0.5;
        }
        return imposto;
    }
}
