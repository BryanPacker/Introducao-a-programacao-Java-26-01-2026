package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        float massa, altura;
        System.out.println("Qual sua massa total?");
        massa = prompt.nextFloat();
        System.out.println("Qual sua altura?");
        altura = prompt.nextFloat();

        altura = massa / (altura * altura);
        System.out.println(altura);
        prompt.close();
        
        if (altura < 18.5) {
            System.out.println("Magreza");
        }
        else if(altura >= 18.5 && altura <= 24.9){
            System.out.println("Saudável");
        }
        else if(altura >= 25 && altura <= 29.9){
            System.out.println("Sobrepeso");
        }
        else if(altura > 30 && altura <= 34.9){
            System.out.println("Obesidade grau I");
        }
        else if(altura >= 35 && altura <= 39.9){
            System.out.println("Obesidade grau II (Severa)");
        }
        else if(altura >= 40){
            System.out.println("Obesidade grau III (Mórbida)");
        }
    }
}
