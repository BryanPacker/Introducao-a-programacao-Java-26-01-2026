package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
       
        String nomeVendedor;
        float salario, totalVendas, salarioTotal;
        Scanner prompt = new Scanner(System.in);
        
        System.out.print("Qual seu nome? ");
        nomeVendedor = prompt.nextLine();
        System.out.print("Qual seu salário fixo? ");
        salario = prompt.nextFloat();
        System.out.print("Qual seu total de vendas? ");
        totalVendas = prompt.nextFloat();

        prompt.close();

        salarioTotal = salario + totalVendas * 0.15f;

        System.out.printf("O seu salário desse mês será o total de: %.2f", salarioTotal );
    }
}
