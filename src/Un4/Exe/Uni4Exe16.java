package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        int m1, m2, h1, h2, soma = 0, prod = 0;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Qual a idade do primeiro homem?");
        h1 = prompt.nextInt();
        System.out.println("Qual a idade do segundo homem?");
        h2 = prompt.nextInt();
        System.out.println("Qual a idade da primeira mulher?");
        m1 = prompt.nextInt();
        System.out.println("Qual a idade da segunda mulher?");
        m2 = prompt.nextInt();

        if (h1 > h2) {
            if (m1 > m2) {
                soma = h1 + m2;
                prod = h2 * m1;
                System.out.println("A soma e o produto das idades é igual aos respectivos valores de: " + soma + ", " + prod);
            }
            else{
                soma = h1 + m1;
                prod = h2 * m2;
                System.out.println("A soma e o produto das idades é igual aos respectivos valores de: " + soma + ", " + prod);
            }
        }
        else{
            if (h1 < h2) {
                if (m1 < m2) {
                    soma = m1 + h2;
                    prod = m2 * h1;
                    System.out.println("A soma e o produto das idades é igual aos respectivos valores de: " + soma + ", " + prod);
                }
                else{
                    soma = h2 + m2;
                    prod = h1 * m1;
                    System.out.println("A soma e o produto das idades é igual aos respectivos valores de: " + soma + ", " + prod);
                }
            }
        }
    }
}
