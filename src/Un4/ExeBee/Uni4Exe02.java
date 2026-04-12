package Un4.ExeBee;

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da 
equação de Bhaskara. Se não for possível calcular as raízes, mostre a
 mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 
 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem 
"Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5
 dígitos após o ponto, com uma mensagem correspondente conforme exemplo 
 abaixo. Imprima sempre o final de linha após cada mensagem. */

        Scanner prompt = new Scanner(System.in);
        double a,b,c;
        a = prompt.nextDouble();
        b = prompt.nextDouble();
        c = prompt.nextDouble();
        double del = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            System.out.println("Impossivel calcular");
        }
        else if(del < 0){
            System.out.println("Impossivel calcular");
        }
        else{
        double xpos = (-b + Math.sqrt(del)) / (2 * a);
        double xneg = (-b - Math.sqrt(del)) / (2 * a);
        System.out.printf("R1 = %.5f%n",xpos);
        System.out.printf("R2 = %.5f%n",xneg);
    }
    }
}
