package receitaFederal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static PessoaJuridica createPJ(Scanner sc){
        System.out.println("Name:");
        String nome = sc.nextLine();
        System.out.println("Anual income:");
        double renda = sc.nextDouble();
        System.out.println("Number of employees:");
        int quantidade = sc.nextInt();
        sc.nextLine();

        return new PessoaJuridica(nome, renda, quantidade);
    }

    public static PessoaFisica createPF(Scanner sc){
        System.out.println("Name:");
        String nome = sc.nextLine();
        System.out.println("Anual income:");
        double renda = sc.nextDouble();
        System.out.println("Health expenditures:");
        double gastosComSaude = sc.nextDouble();
        sc.nextLine();

        return new PessoaFisica(nome, renda, gastosComSaude);
    }

    public static void main(String[] args) {

        System.out.println("Enter the number of tax payers: ");
        Scanner sc = new Scanner(System.in);
        int numContribuintes = sc.nextInt();
        sc.nextLine();

        ArrayList<Pessoa> contribuintes = new ArrayList<Pessoa>();

        for (int i = 0; i < numContribuintes; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");

            String tipoPessoa;
            while (true) {
                System.out.println("Individual or company (i/c)?");
                tipoPessoa = sc.nextLine();

                if (tipoPessoa.equalsIgnoreCase("c")) {
                    PessoaJuridica novaPJ = createPJ(sc);
                    contribuintes.add(novaPJ);
                    break;
                } else if (tipoPessoa.equalsIgnoreCase("i")) {
                    PessoaFisica novaPF = createPF(sc);
                    contribuintes.add(novaPF);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'i' for individual or 'c' for company.\n");
                }
            }
        }


        double valorToral = 0;

        System.out.println("TAXES PAID:");
        for(Pessoa pessoa : contribuintes){
            System.out.printf("%s: $ %.2f\n", pessoa.getNome(), pessoa.calcularImposto());
            //System.out.println("Valor de impostos pago por " + pessoa.getNome() + ": R$" + pessoa.calcularImposto());
            valorToral += pessoa.calcularImposto();
        }

        //System.out.println("Valor total arrecadado de impostos: R$" + valorToral);
        System.out.printf("TOTAL TAXES: $ %.2f\n", valorToral);

    }
}