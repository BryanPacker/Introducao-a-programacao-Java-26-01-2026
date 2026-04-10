package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        String escolha;
        int base, altura, soma, lado;
        double raio, resultado;
        System.out.println("Escolha uma Opção Q, T, R ou C");
        escolha = prompt.next();
        switch (escolha.toUpperCase()) {
            case "T":
                System.out.println("Qual a base do triângulo");
                base = prompt.nextInt();
                System.out.println("Qual a altura do triângulo");
                altura = prompt.nextInt();
                soma = base * altura / 2;
                System.out.println("Área do triangulo igual a" + soma);
                break;
            case "Q": 
                System.out.println("Qual o lado do quadrado?");
                lado = prompt.nextInt();
                soma = lado * lado;
                System.out.println("Área do quadrado igual a " + soma);
                break;    
            case "R":
                System.out.println("Qual a altura do retângulo?");
                altura = prompt.nextInt();
                System.out.println("Qual a base do retângulo");
                base = prompt.nextInt();
                soma = base * altura;
                System.out.println("Área do retângulo igual a " + soma);
                break;
            case "C":
                System.out.println("Digite o raio");
                raio = prompt.nextDouble();
                resultado = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do círculo igual a " + resultado);
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
