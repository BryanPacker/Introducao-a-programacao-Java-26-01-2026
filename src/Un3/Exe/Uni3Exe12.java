package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe12 {
    private int numeroDependentes; 
    private int horasTrabalhadas;

    public Uni3Exe12(int numeroDependentes, int horasTrabalhadas){
        this.numeroDependentes = numeroDependentes;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public float calcularSalario(){
        return (this.horasTrabalhadas * 10f) + (this.numeroDependentes * 60f);
    }
    public float calculoInss(){
        return ((this.calcularSalario() - this.numeroDependentes * 60f)) * 0.085f;
    }
    public float calculoIr(){
        return (this.calcularSalario() - this.numeroDependentes * 60f) * 0.05f;
    }
    public float calcularSalarioLiquido(){
        return this.calcularSalario() - calculoInss() - calculoIr();
    }
    public static void main(String[] args) {
        
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String nomeFuncionario = prompt.nextLine();
        System.out.println("Quantas horas foram trabalhadas?");
        int horasTrabalhadas = prompt.nextInt();
        System.out.println("Qual o número de dependentes?");
        int numeroDependentes = prompt.nextInt();

        prompt.close();

        Uni3Exe12 exe12 = new Uni3Exe12( numeroDependentes, horasTrabalhadas);

        System.out.println("Olá " + nomeFuncionario);
        System.out.printf("O salário total é igual a %.2f sendo descontados %.2f de INSS e %.2f de IR%n", exe12.calcularSalario(), exe12.calculoInss(), exe12.calculoIr());
        System.out.printf("O salário líquido é igual a %.2f", exe12.calcularSalarioLiquido());
    }
}
