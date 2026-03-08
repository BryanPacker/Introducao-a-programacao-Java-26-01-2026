package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        
        Scanner prompt = new Scanner(System.in);

        System.out.print("Qual o nome do funcionário? ");
        String nomeColaborador = prompt.nextLine();
        System.out.println("\nQual o número de dependentes? ");
        int numDependentes = prompt.nextInt();
        System.out.println("\nQual o número de horas trabalhadas no mês? ");
        int numHorasTrabalhadas = prompt.nextInt();

        prompt.close();

        int salarioFamilia = numDependentes * 60;
        int salarioTrabalho = numHorasTrabalhadas * 10;
        int salarioBruto = salarioFamilia + salarioTrabalho;
        double salarioLiquido = salarioFamilia + (salarioTrabalho - (salarioTrabalho * 0.05f) - (salarioTrabalho * 0.085f));
        
        System.out.printf("O salário bruto do funcionário %s é igual a: %d e o salário liquído é igual a: %.2f ", nomeColaborador, salarioBruto, salarioLiquido);

        
    }
}
/*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes.
A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família)
e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Ao final informe o nome,
o salário bruto e o salário líquido do funcionário.*/