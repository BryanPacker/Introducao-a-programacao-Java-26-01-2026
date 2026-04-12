package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe27 {
  public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    int chegadaHora = 0, chegadaMinuto = 0, saidaHora = 0, saidaMinuto = 0;

    System.out.println("Que horas você estacionou seu carro?");
    chegadaHora = prompt.nextInt();
    System.out.println("Quais eram os minutos quando você estacionou seu carro?");
    chegadaMinuto = prompt.nextInt();
    System.out.println("Que horas você tirou seu carro do estacionamento?");
    saidaHora = prompt.nextInt();
    System.out.println("Quais eram os minutos quando você tirou seu carro do estacionamento?");
    saidaMinuto = prompt.nextInt();

    if (chegadaHora < 0 || chegadaHora > 24 || saidaHora < 0 || saidaHora > 24 || chegadaMinuto > 60 || chegadaMinuto < 0 || saidaMinuto < 0 || saidaMinuto > 60) {
        System.out.println("Houve algum erro de digitação, certifique-se de você chegou entre 00:00 e 23:59");
    }
    else if (chegadaHora > saidaHora || chegadaHora == saidaHora && chegadaMinuto > saidaMinuto) {
        System.out.println("certifique-se de os dados de entrada são iguais ou menores que os de saida");
    }
    else{
    float valorHora = 0;
    float totalPagamento = 0;
    int transfChegada = 0, transfSaida = 0;
    transfChegada = (chegadaHora * 60) + chegadaMinuto;
    transfSaida = (saidaHora * 60) + saidaMinuto;
    int totalEstacionadoHoras = (transfSaida - transfChegada) / 60;
    int sobraminutos = (transfSaida - transfChegada) % 60;
    if (totalEstacionadoHoras < 1) {
        totalPagamento = 5;
        System.out.println("O total a pagar é igual a R$"+totalPagamento);
    }
    else if (totalEstacionadoHoras < 2) {
        valorHora = 5;
        if (sobraminutos < 30){
            totalPagamento = valorHora * totalEstacionadoHoras;
            System.out.println("Total a pagar = R$"+totalPagamento);
        }
        else {
            totalPagamento = valorHora * (totalEstacionadoHoras + 1);
            System.out.println("Total a pagar = R$"+totalPagamento);
        }
    }
    else if (totalEstacionadoHoras < 4) {
        valorHora = 7.5f;
        if (sobraminutos < 30){
            totalPagamento = 10 + valorHora * (totalEstacionadoHoras - 2);
            System.out.println("Total a pagar = R$"+totalPagamento);
        }
        else {
            totalPagamento = 10 + valorHora * (totalEstacionadoHoras + 1 - 2);
            System.out.println("Total a pagar = R$"+totalPagamento);
        }
    }
    else {
        valorHora = 10;
        if (sobraminutos < 30){
            totalPagamento = 25 + valorHora * (totalEstacionadoHoras - 4);
            System.out.println("Total a pagar = R$"+totalPagamento);
        }
        else {
            totalPagamento = 25 + valorHora * (totalEstacionadoHoras + 1 - 4);
            System.out.println("Total a pagar = R$"+totalPagamento);
        }
    }      
        }
    }
}
