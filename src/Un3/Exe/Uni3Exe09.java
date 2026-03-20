package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe09 {
    private double raio;
    private double altura;
    private double pi;
    public Uni3Exe09(double raio, double altura, double pi){
        this.altura = altura;
        this.raio = raio;
        this.pi = pi;
    }
    public double volume(){
        return this.pi * this.raio * this.altura;
    } 
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        double pi, altura, raio;

        pi = Math.PI;
        System.out.println("Qual a altura?");
        altura = prompt.nextFloat();

        System.out.println("Qual o raio?");
        raio = prompt.nextFloat();
        prompt.close();
        raio = Math.pow(raio, 2f);
        Uni3Exe09 exe09 = new Uni3Exe09(altura, raio, pi);
        System.out.printf("O volume total do cilíndro é igual a: %.2f", exe09.volume());
    }
}
