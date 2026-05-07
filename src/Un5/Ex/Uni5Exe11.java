package Un5.Ex;

import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Quantas horas a maquina trabalhou?");
        int numHoras = prompt.nextInt();
        int h1 = 1, h2 = 3;
        for (int i = 1; i <= numHoras; i++) {
            if (i > 2) {
                h2 = h2 + (h2*3);
            }
        }
        if (numHoras == 1) {
            System.out.println("A máquina quebrou somente 1 biscoito");
        }
        else if (numHoras == 2) {
            System.out.println("A máquina quebrou somente 3 biscoitos");                    
        }
        else {
            System.out.println("A máquina quebrou " + h2 + " biscoitos");
        }
    }
}
