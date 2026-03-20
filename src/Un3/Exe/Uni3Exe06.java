package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe06 {
    private float pesoPrato;
    private float kiloComida;
    private float valorKilo;
    public Uni3Exe06(float pesoPrato, float kiloComida, float valorKilo){
        this.pesoPrato = pesoPrato;
        this.kiloComida = kiloComida;
        this.valorKilo = valorKilo;
    }

    public float qntGastos(){
        return this.valorKilo * (this.kiloComida - this.pesoPrato); 
    } 
    
    public static void main(String[] args) {
        float kiloComida;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Quantos kilos de comida foram adquiridos?");
        kiloComida = prompt.nextFloat();
        prompt.close();
        Uni3Exe06 exe06 = new Uni3Exe06(0.75f, kiloComida, 25.00f);
        System.out.println("Dado o peso " + kiloComida + "KG o valor total é igual a R$" + exe06.qntGastos());
    }
}
