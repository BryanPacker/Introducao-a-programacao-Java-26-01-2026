package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
       
        float dol, cotacaoDol, conversao;
        Scanner prompt = new Scanner(System.in);
     
        System.out.print("Qual a quantidade de dólares a passar por câmbio? ");
        dol = prompt.nextFloat();

        prompt.close();
        
        cotacaoDol = 5.23f;
        conversao = dol * cotacaoDol;
      
        System.out.printf("O valor após conversão é um total de: %.2f", conversao); 
    }
}
