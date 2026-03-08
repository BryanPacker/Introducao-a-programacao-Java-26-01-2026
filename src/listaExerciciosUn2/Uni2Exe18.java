package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {

        double alturaMetros, comprimentoMetros;

        Scanner prompt = new Scanner(System.in); 

        System.out.println("Qual a altura da parede em metros? ");
        alturaMetros = prompt.nextDouble();
        System.out.println("Qual a largura da parede em metros? ");
        comprimentoMetros = prompt.nextDouble();

        prompt.close();

        double valorAzulejos = ((alturaMetros * comprimentoMetros) * 9f) * 12.5f;
        
        System.out.printf("O valor total dos azulejos é igual a: %.2f", valorAzulejos);

    }
}
/*Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
Leia o comprimento e altura de uma parede (em metros) e escreva o valor gasto com a compra de azulejos.
 Considere que um metro quadrado é formado por 9 azulejos.*/