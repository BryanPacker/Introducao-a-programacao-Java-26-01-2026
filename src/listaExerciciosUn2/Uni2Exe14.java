package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {

        int valor, resto; 
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Qual o valor a ser decomposto?");
        valor = prompt.nextInt();

        prompt.close();
       
        System.out.println("A decomposição de R$" + valor + " é igual ao seguinte valor: ");
    
        resto = valor / 100;
        valor = valor % 100; 
        System.out.println( resto + " Notas de 100");
    
        resto = valor / 50;
        valor = valor % 50; 
        System.out.println(resto + " Notas de 50");
    
        resto = valor / 20;
        valor = valor % 20;
        System.out.println(resto + " Notas de 20");
    
        resto = valor / 10;
        valor = valor % 10;
        System.out.println(resto + " Notas de 10");
    
        resto = valor / 5;
        valor = valor % 5;
        System.out.println(resto + " Notas de 5");
    
        resto = valor / 2;
        valor = valor % 2;
        System.out.println(resto + " Notas de 2");
    
        resto = valor / 1;
        valor = valor % 1;
        System.out.println(resto + " Em moedas de 1 Real");
        
    }
}
/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de
 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias. */