package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        int mes;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Você foi admito a quantos meses?");
        mes = prompt.nextInt();

        if (mes > 48) {
            System.out.println("reajuste não informado");
        }
        if (mes < 13) {
            System.out.println("Reajuste de 5%");
        }
        if (mes >= 13 && mes <= 48) {
            System.out.println("Reajuste de 7%");
        }
    }
}
