package Un3;

import java.util.Scanner;

public class CalculadoraV2 {

    public double somar( double numeroUm, double numeroDois){
        return numeroUm + numeroDois;
    }

    public double subtrair( double numeroUm, double numeroDois){
        return numeroUm - numeroDois;
    }

    public double multiplicar( double numeroUm, double numeroDois){
        return numeroUm * numeroDois;
    }

    public double dividir( double numeroUm, double numeroDois){
        return numeroUm / numeroDois;
    }

    public double exponencia( double numeroUm, double numeroDois){
        return Math.pow( numeroUm, numeroDois);
    }

    public double raiz( double numeroUm){
        return Math.sqrt(numeroUm);
    }

    public static void main(String[] args) {
        double valor, numeroUm, numeroDois;

        Scanner prompt = new Scanner(System.in);
        CalculadoraV2 calc = new CalculadoraV2( );
        
        // Soma
        System.out.println("Qual o primeiro numero da soma? ");
        numeroUm = prompt.nextDouble();
        System.out.println("Qual o segundo numero da soma? ");
        numeroDois = prompt.nextDouble();

        valor = calc.somar(numeroUm, numeroDois);
        System.out.println(valor);

        // Subtração
        System.out.println("Qual o primeiro numero da subtração? ");
        numeroUm = prompt.nextDouble();
        System.out.println("Qual o segundo numero da subtração? ");
        numeroDois = prompt.nextDouble();

        valor = calc.subtrair(numeroUm, numeroDois);
        System.out.println(valor);

        // Multiplicação
        System.out.println("Qual o primeiro numero da multiplicação? ");
        numeroUm = prompt.nextDouble();
        System.out.println("Qual o segundo numero da multiplicação? ");
        numeroDois = prompt.nextDouble();

        valor = calc.multiplicar(numeroUm, numeroDois);
        System.out.println(valor);

        // Divisão
        System.out.println("Qual o primeiro numero da divisão? ");
        numeroUm = prompt.nextDouble();
        System.out.println("Qual o segundo numero da divisão? ");
        numeroDois = prompt.nextDouble();

        valor = calc.dividir(numeroUm, numeroDois);
        System.out.println(valor);

        // Exponência
        System.out.println("Qual o primeiro numero da exponência? ");
        numeroUm = prompt.nextInt();
        System.out.println("Qual o segundo numero da exponência? ");
        numeroDois = prompt.nextInt();

        valor = calc.exponencia(numeroUm, numeroDois);
        System.out.println(valor);

        // Raiz
        System.out.println("Qual o numero da raiz? ");
        numeroUm = prompt.nextDouble();
        prompt.close();

        valor = calc.raiz(numeroUm);
        System.out.println(valor);

    }
}
