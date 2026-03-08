package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);

        System.out.println("Qual o número de pares de dobras?");
        double numDobras = prompt.nextInt();

        prompt.close();

        numDobras = Math.pow(4, numDobras);
        
        System.out.printf("A quantidade de dobras vistas após desdobrar o papel é igual a: %.0f", numDobras);
    }
}
/*Considere que você tenha um papel quadrado e o dobre varias vezes sempre em um número par de dobra no meio do quadrado.
Ao abrir a folha de papel é possível verificar a marcação de novos quadrados.
Baseado nisso leia o número de dobras (lembre que sempre é um número par) feitas no papel e escreva quantos quadrados podem ser vistos após desdobrá-lo.*/