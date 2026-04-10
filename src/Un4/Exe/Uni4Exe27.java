package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int horas1 = 0, minutos1 = 0, horas2 = 0, minutos2 = 0, valorTotal ;
        System.out.println("Que horas você entrou no estacionado?");
        horas1 = prompt.nextInt();
        System.out.println("Qual eram os minutos quando você entrou no estacionamento?");
        minutos1 = prompt.nextInt();
        System.out.println("Que horas você saiu no estacionado?");
        horas2 = prompt.nextInt();
        System.out.println("Qual eram os minutos quando você saiu no estacionamento?");
        minutos2 = prompt.nextInt();

        int minutosChegadaNoLocal = (horas1 * 60) + minutos1;
        int minutosSaidaNoLocal = (horas2 * 60) + minutos2;
        int minutosNoLocal = minutosSaidaNoLocal - minutosChegadaNoLocal;
        int minutosSobra = minutosNoLocal % 60;
        int minutosHora = minutosNoLocal / 60;
        int valorHora = 0;

        if (horas1 < 0 || minutos1 < 0 && horas1 > 23 || minutos1 > 59) {
            System.out.println("Horário inválido, certifique-se de colocar um horário entre 00:00 e 23:59");
        }
        else if (horas2 > 24 || minutos2 > 59 || horas2 < horas1){
            System.out.println("Horário de saída inválido certifique-se de que sua saida foi em um horário superior ao de entrada e menor do que 00:00 ");
        }
        else if (horas1 == horas2 && minutos2 < minutos1) {
            System.out.println("Horário de saída inválido certifique-se de que sua saida foi em um horário superior ao de entrada e menor do que 00:00");
        }       
        if (minutosNoLocal <= 29 && minutosNoLocal < 60) {
            valorTotal = 5;
            System.out.println("O valor total é igual " + valorTotal);
        }
        else if (minutosHora <= 2 && minutosSobra <= 29) {
            valorHora = 5;
            valorTotal = valorHora * minutosHora;
        }
        else if (minutosHora <= 2 && minutosSobra > 29) {
            valorHora = 5;
            valorTotal = valorHora * minutosHora + ;
        }
        else if (minutosHora <= 4 )
        
    }
}
