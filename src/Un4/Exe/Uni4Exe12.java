package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.println("Qual o comprimento do primeiro lado");
        lado1 = prompt.nextInt();
        System.out.println("Qual o comprimento do segundo lado");
        lado2 = prompt.nextInt();
        System.out.println("Qual o comprimento do terceiro lado");
        lado3 = prompt.nextInt();
        int somaComprimentos1 = lado1 + lado2;
        int somaComprimentos2 = lado3 + lado2;
        int somaComprimentos3 = lado1 + lado3;

        if (somaComprimentos1 <= lado3 || somaComprimentos2 <= lado1 || somaComprimentos3 <= lado2) {
            System.out.println("não é um triângulo");
        }
        else{
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("triângulo equilátero");
            }
            else{
                if (lado1 == lado2 || lado1  == lado3 || lado2 == lado3) {
                    System.out.println("É um triângulo isóscele");
                }
                else{
                    System.out.println("É um triângulo escaleno");
                }
            }
        }
    }
}
