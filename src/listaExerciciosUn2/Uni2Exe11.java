package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        
        double a, b, c;
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Qual o valor de A? ");
        a = prompt.nextDouble();
        System.out.println("Qual o valor de B? ");
        b = prompt.nextDouble();
        System.out.println("Qual o valor de C? ");
        c = prompt.nextDouble();
        
        prompt.close();

        double area, circulo, javaPI, trapezio, quadrado, retangulo;
        area = (a * c) / 2;
        javaPI = Math.PI;
        circulo = javaPI * (Math.pow(c, 2));
        trapezio = ((a + b) * c) / 2;
        quadrado = Math.pow(b,2);
        retangulo = a * b;

        System.out.println("A área do triângulo retângulo é igual a" + area);
        System.out.println("A área do círculo é igual a" + circulo);
        System.out.println("A área do trapézio é igual a" + trapezio);
        System.out.println("A área do quadrado é igual a" + quadrado);
        System.out.println("A área do retângulo é igual a" + retangulo);

    }
}

/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159).
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */