package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe13 {
    private float comprimento;
    private float altura;

    public Uni3Exe13(float comprimento, float altura){
        this.altura = altura;
        this.comprimento = comprimento;
    }
    public float calculoMetrosQuadrados(){
        return this.altura * this.comprimento;
    }
    public float calculoValorAzuleijos(){
        return (this.calculoMetrosQuadrados() * 9f) * 12.5f; 
    }

    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        float comprimento, altura;

        System.out.println("Qual o comprimento total da parede? (Formato X metros / X,XX metros)");
        comprimento = prompt.nextFloat();

        System.out.println("Qual a altura total da parede? (Formato X metros / X,XX metros)");
        altura = prompt.nextFloat();

        Uni3Exe13 exe13 = new Uni3Exe13(comprimento, altura);
        System.out.printf("Dados os seguintes dados: altura = %.2f e comprimento = %.2f%n", altura, comprimento);
        System.out.printf("A parede tem %.2f metros quadrados com um valor total gasto em azuleijos sendo igual a R$%.2f", exe13.calculoMetrosQuadrados(), exe13.calculoValorAzuleijos());
    }
}
