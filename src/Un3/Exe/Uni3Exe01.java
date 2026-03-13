package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe01 {
    // Atributos
    private int comprimento;
    private int largura;

    // Construtor
    public Uni3Exe01(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea(){
        return this.comprimento * this.largura;
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int comprimento, largura;

        System.out.println("Qual o comprimento total?");
        comprimento = prompt.nextInt();

        System.out.println("Qual a largura total?");
        largura = prompt.nextInt();

        prompt.close();
        
        Uni3Exe01 clasExe01 = new Uni3Exe01(comprimento, largura);
        int resultado = clasExe01.calcularArea();

        System.out.println("Área total igual a " + resultado + "m²");
    }
}
