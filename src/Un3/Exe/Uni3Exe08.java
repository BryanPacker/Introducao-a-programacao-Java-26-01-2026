package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe08 {
    private float qntDolar;

    public Uni3Exe08(float qntDolar){
        this.qntDolar = qntDolar;
    }
    public float conversaoDolar(){
        return this.qntDolar * 5.65f;
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Quantos dolares você gostaria de trocar(Formato : x,xx)?");
        float qntDolar = prompt.nextFloat();

        Uni3Exe08 exe08 = new Uni3Exe08(qntDolar);
        System.out.println("A conversão em reais é igual a R$" + exe08.conversaoDolar());
    }
}
