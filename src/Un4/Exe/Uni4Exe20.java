package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        float prova1, prova2, prova3;
        System.out.println("Qual a primeira nota");
        prova1 = prompt.nextFloat();
        System.out.println("Qual a segunda nota");
        prova2 = prompt.nextFloat();
        System.out.println("Qual a terceira nota");
        prova3 = prompt.nextFloat();
        System.out.println("Qual a nota do exercício");
        float notaExercicio = prompt.nextFloat();

        prova1 = (prova1+prova2*2+prova3*3+notaExercicio)/7;
        if (prova1 >= 9) {
            System.out.println("Conceito A, Aprovado");
            System.out.println("Média de aproveitamento = " + prova1);            
        }
        else if(prova1 >= 7.5 && prova1 < 9){
            System.out.println("Conceito B, Aprovado");
            System.out.println("Média de aproveitamento = " + prova1);            
        }
        else if(prova1 >= 6 && prova1 < 7.5){
            System.out.println("Conceito C, Aprovado");
            System.out.println("Média de aproveitamento = " + prova1);            
        }
        else if(prova1 >= 4 && prova1 < 6){
            System.out.println("Conceito D, Reprovado");
            System.out.println("Média de aproveitamento = " + prova1);            
        }
        else if(prova1 < 4){
            System.out.println("Conceito E, Reprovado");
            System.out.println("Média de aproveitamento = " + prova1);            
        }
    }
}
