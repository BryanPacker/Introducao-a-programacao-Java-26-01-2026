package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe07 {
    private int pesoAdicional;
    public Uni4Exe07(int pesoAdicional){
        this.pesoAdicional = pesoAdicional;
    }
    public int adicional(){
        return (this.pesoAdicional / 20) + 1;
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int pesoCarta;
        System.out.println("Qual o peso da carta?");
        pesoCarta = prompt.nextInt();
        int pesoAdicional = pesoCarta - 50;
        Uni4Exe07 exe07 = new Uni4Exe07(pesoAdicional);
        if (pesoCarta <= 50) {
            System.out.println("O valor a ser pago é de R$0,45 centavos");
        }
        else{
            float adicional = 0.45f + (0.45f * exe07.adicional());
            System.out.printf("O valor a ser pago é igual a %.2f", adicional);
        }
}
}
