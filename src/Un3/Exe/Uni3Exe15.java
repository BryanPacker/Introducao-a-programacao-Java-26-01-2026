package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe15 {
    private final int numeroInteiro;
    private int resto;

    public Uni3Exe15(int numeroInteiro){
        this.numeroInteiro = numeroInteiro;
    }
    public int calculoCentenas(){
        return this.numeroInteiro / 100;    
    }

    public int calculoDezenas(){
        return (numeroInteiro % 100) / 10;
    }

    public int calculoUnidades(){
        return (numeroInteiro % 10);
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int numeroInteiro;

        System.out.println("Digite um número inteiro de três dígitos.");
        numeroInteiro = prompt.nextInt();
        prompt.close();

        Uni3Exe15 exe15 = new Uni3Exe15(numeroInteiro);
        System.out.println("Com a decomposição do seguinte número: " + numeroInteiro + " conseguimos chegar nas seguintes centenas, dezenas e unidades");
        
        System.out.printf("O número decomposto é igual a %d centenas, %d dezenas e %d unidades", exe15.calculoCentenas(), exe15.calculoDezenas(), exe15.calculoUnidades());

    }

}
