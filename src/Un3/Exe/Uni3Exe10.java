package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe10 {
    private double cateto1;
    private double cateto2;

    public Uni3Exe10(double cateto1, double cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    public double hipo(){
        return this.cateto1 + this.cateto2;
    }
    public static void main(String[] args) {
        double cateto1, cateto2;
        Scanner prompt = new Scanner(System.in);

        System.out.println("Qual o cateto adjacente");
        cateto1 = prompt.nextDouble();
        cateto1 = Math.pow(cateto1, 2f);
        System.out.println("Qual o cateto oposto");
        cateto2 = prompt.nextDouble();
        cateto2 = Math.pow(cateto2, 2f);

        Uni3Exe10 exe10 = new Uni3Exe10(cateto1, cateto2);
        double hipo = exe10.hipo();
        hipo = Math.sqrt(hipo);
        System.out.printf("A hipotenusa é igual a %.2f", hipo);
    }
}
