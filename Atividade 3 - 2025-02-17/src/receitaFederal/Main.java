package receitaFederal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static PessoaJuridica createPJ(Scanner sc){
        System.out.println("Insira o nome do pessoa jurídica:");
        String nome = sc.nextLine();
        System.out.println("Insira a renda anual da pessoa:");
        double renda = sc.nextDouble();
        System.out.println("Insira a quantidade de funcionários da empresa:");
        int quantidade = sc.nextInt();
        sc.nextLine();

        return new PessoaJuridica(nome, renda, quantidade);
    }

    public static PessoaFisica createPF(Scanner sc){
        System.out.println("Insira o nome do pessoa fisica:");
        String nome = sc.nextLine();
        System.out.println("Insira a renda anual da pessoa:");
        double renda = sc.nextDouble();
        System.out.println("Insira os gastos com saúde da pessoa:");
        double gastosComSaude = sc.nextDouble();
        sc.nextLine();

        return new PessoaFisica(nome, renda, gastosComSaude);
    }

    public static void main(String[] args) {

        System.out.println("Quantos contribuintes serão inseridos? (Valor em número)");
        Scanner sc = new Scanner(System.in);
        int numContribuintes = sc.nextInt();
        sc.nextLine();

        ArrayList<Pessoa> contribuintes = new ArrayList<Pessoa>();

        for (int i = 0; i < numContribuintes; i++) {
            System.out.println("Cadastro da pessoa " + i+1 + " :\n");
            System.out.println("Trata-se de uma pessoa física ou de uma pessoa jurídica? (Responda com PJ ou PF)");
            String tipoPessoa = sc.nextLine();
            if(tipoPessoa.equalsIgnoreCase("pj")){
                PessoaJuridica novaPJ = createPJ(sc);
                contribuintes.add(novaPJ);
            }else if(tipoPessoa.equalsIgnoreCase("pf")){
                PessoaFisica novaPF =  createPF(sc);
                contribuintes.add(novaPF);
            }
        }

        double valorToral = 0;

        for(Pessoa pessoa : contribuintes){
            System.out.printf("Valor de impostos pago por %s: R$ %.2f\n", pessoa.getNome(), pessoa.calcularImposto());
            //System.out.println("Valor de impostos pago por " + pessoa.getNome() + ": R$" + pessoa.calcularImposto());
            valorToral += pessoa.calcularImposto();
        }

        //System.out.println("Valor total arrecadado de impostos: R$" + valorToral);
        System.out.printf("Valor total arrecadado de impostos: R$%.2f\n", valorToral);

    }
}