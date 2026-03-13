package Un1;

import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Qual o valor a ser decomposto?");
        double entrada = prompt.nextDouble();

        prompt.close();

        // resposta com ajuda de IA, não consegui descobrir como fazer
        int valor = (int) Math.round(entrada * 100);

        System.out.printf("A decomposição de R$%.2f é igual a: %n", entrada);

        int resto = valor / 10000; valor = valor % 10000;
        System.out.printf("%d em notas de 100 reais%n", resto);
        resto = valor / 5000; valor = valor % 5000;
        System.out.printf("%d em notas de 50 reais%n", resto);
        resto = valor / 2000; valor = valor % 2000;
        System.out.printf("%d em notas de 20 reais%n", resto);
        resto = valor / 1000; valor = valor % 1000;
        System.out.printf("%d em notas de 10 reais%n", resto);
        resto = valor / 500;  valor = valor % 500;
        System.out.printf("%d em notas de 5 reais%n", resto);
        resto = valor / 200;  valor = valor % 200;
        System.out.printf("%d em notas de 2 reais%n", resto);

        resto = valor / 100;  valor = valor % 100;
        System.out.printf("%d em moedas de 1 real%n", resto);
        resto = valor / 50;   valor = valor % 50;
        System.out.printf("%d em moedas de 50 centavos%n", resto);
        resto = valor / 25;   valor = valor % 25;
        System.out.printf("%d em moedas de 25 centavos%n", resto);
        resto = valor / 10;   valor = valor % 10;
        System.out.printf("%d em moedas de 10 centavos%n", resto);
        resto = valor / 5;    valor = valor % 5;
        System.out.printf("%d em moedas de 5 centavos%n", resto);
        resto = valor / 1;
        System.out.printf("%d em moedas de 1 centavo%n", resto);
    }
}
/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis 
no qual o valor pode ser 
decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias. */