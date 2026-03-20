package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe07 {
    private float qnt350;
    private float qnt600;
    private float qnt2000;

    public Uni3Exe07(float qnt350, float qnt600, float qnt2000){
        this.qnt350 = qnt350;
        this.qnt600 = qnt600; 
        this.qnt2000 = qnt2000;
    }

    public float qntLitros(){
        return ((this.qnt350 * 350f) + (this.qnt600 * 600f) + (this.qnt2000 * 2000f)) / 1000;
    }

    public static void main(String[] args) {
     float qnt350, qnt2000, qnt600;
        Scanner prompt = new Scanner(System.in);

        System.out.println("Quantas latas de 350ml foram adquiridas?");
        qnt350 = prompt.nextFloat();
        System.out.println("Quantas garrafas de 600ml foram adquiridas?");
        qnt600 = prompt.nextFloat();
        System.out.println("Quantas garrafas de 2000ml foram adquiridas?");
        qnt2000 = prompt.nextFloat();
        prompt.close();

        Uni3Exe07 exe07 = new Uni3Exe07(qnt350, qnt600, qnt2000);
        System.out.println("A quantidade total de litros é igual a: " + exe07.qntLitros() + "L");
    }
}
