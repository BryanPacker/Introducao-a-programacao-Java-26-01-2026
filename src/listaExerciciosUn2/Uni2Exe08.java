package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        int codigoPeca, numeroPeca, codigoPeca2, numeroPeca2;
        float valorPeca, valorPeca2, valorTotal;
        Scanner prompt = new Scanner(System.in);
        
        System.out.print("Qual o código da primeira peça? ");
        codigoPeca = prompt.nextInt();
        System.out.print("Qual o código da segunda peça? ");
        codigoPeca2 = prompt.nextInt();

        System.out.print("Qual a quantidade da primeira peça? ");
        numeroPeca = prompt.nextInt();
        System.out.print("Qual a quantidade da segunda peça? ");
        numeroPeca2 = prompt.nextInt();
        
        System.out.print("Qual o valor da primeira peça? ");
        valorPeca = prompt.nextInt();
        System.out.print("Qual o valor da segunda peça? ");
        valorPeca2 = prompt.nextInt();

        prompt.close();
        
        valorTotal = (valorPeca * numeroPeca) * (valorPeca2 * numeroPeca2);
        System.out.printf("O valor total das suas compras é de: %.2f", valorTotal);
        
    }
}
