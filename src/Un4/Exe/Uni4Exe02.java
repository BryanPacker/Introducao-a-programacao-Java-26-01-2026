package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe02 {
    private int numero;

    public Uni4Exe02(int numero){
        this.numero = numero;
    }
    public int comparadorImpPar(){
        return this.numero % 2;
    }

    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int numero;
        System.out.println("Diga qualquer número inteiro e te respondo se o mesmo é ímpar ou par");
        numero = prompt.nextInt();

        Uni4Exe02 exe02 = new Uni4Exe02(numero);
        numero = exe02.comparadorImpPar();
        if (numero == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é ímpar");
        }
    }
}
