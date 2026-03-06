package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        int valor; 
        Scanner prompt = new Scanner(System.in);
        System.out.println("Qual o valor a ser decomposto?");
        valor = prompt.nextInt();
        prompt.close();
        ced100 = valor / 100;
        resto = ced100 % 100;
        ced50 = valor / 50;
        resto = ced50 % 50;
        ced20 = valor / 20;
        resto = ced20 % 20;
        ced10 = valor / 10;
        resto = ced10 % 10;
        ced5 = valor / 5;
        resto = ced5 % 5;
        ced2 = valor / 2;
        resto = ced100 % 100;
        ced1 = valor / 1;
        resto = ced100 % 1;

        System.out.printf("A decomposição do valor igual a %.2d em notas de cem reais é igual a %d%n", valor);
        System.out.printf("A decomposição do valor igual a %.2d em notas de cinquenta reais é igual a %d%n", valor);
        System.out.printf("A decomposição do valor igual a %.2d em notas de vinte reais é igual a %d%n", valor);
        System.out.printf("A decomposição do valor igual a %.2d em notas de dez reais é igual a %d%n", valor);
        System.out.printf("A decomposição do valor igual a %.2d em notas de cinco reais é igual a %d%n", valor);
        System.out.printf("A decomposição do valor igual a %.2d em notas de dois reais é igual a %d%n", valor);
        System.out.printf("A decomposição do valor igual a %.2d em moedas de um real é igual a %d%n", valor);


    }
}
/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de
 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias. */