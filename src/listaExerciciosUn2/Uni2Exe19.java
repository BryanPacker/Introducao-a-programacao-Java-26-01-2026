package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) {
       
        double a, b, c, d;

        Scanner prompt = new Scanner(System.in); 
        
        System.out.println("Qual o valor de b?");
        b = prompt.nextDouble();
        System.out.println("Qual o valor de c?");
        c = prompt.nextDouble();
        System.out.println("Qual o valor de d?");
        d = prompt.nextDouble();

        prompt.close();
        
        System.out.printf("O valor de A é igual a: %.2f", b);
    }
}
/*Num sistema de equações o valor de A equivale ao valor de B e o valor de C equivale ao valor de D.
 Leia os valores de B, C e D e calcule o valor de A.*/