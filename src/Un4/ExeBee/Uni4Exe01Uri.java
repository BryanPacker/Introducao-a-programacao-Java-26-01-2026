package Un4.ExeBee;

import java.util.Scanner;

public class Uni4Exe01Uri {
/*Leia 4 valores inteiros A, B, C e D.
A seguir, se B for maior do que C e se D for maior do que A, e
a soma de C com D for maior que a soma de A e B e se C e D, ambos,
forem positivos e se a variável A for par escrever a mensagem 
"Valores aceitos", senão escrever "Valores nao aceitos". */
    public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    int a,b,c,d; 
    System.out.println("Qual o valor de A?");
    a = prompt.nextInt();
    System.out.println("Qual o valor de B?");
    b = prompt.nextInt();
    System.out.println("Qual o valor de C?");
    c = prompt.nextInt();
    System.out.println("Qual o valor de D?");
    d = prompt.nextInt();

    int somaCD = c + d;
    int somaAB = a + b;
    if (b > c && d > a && somaCD > somaAB && c > 0 && d > 0 && a % 2 == 0 ) {
        System.out.println("Valores aceitos");
    }
    else{
        System.out.println("Valores nao aceitos");
    }
}
}
