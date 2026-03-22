package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe04 {
    private float numero;

    public Uni4Exe04(float numero){
        this.numero = numero;
    }
    public float numeroComparado(){
        return this.numero % 1;
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        float numero;
        System.out.println("Escolha um número com ou sem casas decimais");
        numero = prompt.nextFloat();

        Uni4Exe04 exe04 = new Uni4Exe04(numero);
        if (exe04.numeroComparado() == 0) {
            System.out.println("O número não tem casas decimais");
        }
        else{
            System.out.println("O número tem casas decimais");
        }
    }
}
