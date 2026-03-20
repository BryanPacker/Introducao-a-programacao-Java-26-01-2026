package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe05 {
    private int qntFrangos;

    public Uni3Exe05(int qntFrangos){
        this.qntFrangos = qntFrangos;
    }
    public float gastosFrango(){
        return (this.qntFrangos * 4f) + (this.qntFrangos * 2f * 3.5f);
    }
    public static void main(String[] args) {
        int qntFrangos;

        Scanner prompt = new Scanner(System.in);
        System.out.println("Qual a quantidade total de frangos na sua granja?");
        qntFrangos = prompt.nextInt();

        Uni3Exe05 exe05 = new Uni3Exe05(qntFrangos);
        System.out.println("Dado a seguinte quantidade de frangos na granja: " + qntFrangos + " O valor total gasto para rastreio de qualidade é igual a R$" + exe05.gastosFrango());
    }
}
