package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe16 {
    private int valorCompra;
    private int valorPago;

    public Uni3Exe16(int valorCompra, int valorPago){
        this.valorCompra = valorCompra;
        this.valorPago = valorPago;
    }
    public int valorTroco(){
        return this.valorPago - valorCompra;
    }
    public int decompNotas100(){
         return this.valorTroco() / 100;
    }
    public int decompNotas10(){
        return (this.valorTroco() % 100) / 10;
    }
    public int decompMoedas1(){
        return this.valorTroco() % 10;
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int valorCompra, valorPago;

        System.out.println("Qual o valor total da compra? (Somente inteiros)");
        valorCompra = prompt.nextInt();

        System.out.println("Qual o valor pago pelo cliente? (Somente inteiros)");
        valorPago = prompt.nextInt();
        prompt.close();

        Uni3Exe16 exe16 = new Uni3Exe16(valorCompra, valorPago);
        final int valorTroco = exe16.valorTroco();
        System.out.println("O valor total do troco é igual a " + exe16.valorTroco() + " reais");
        System.out.println("O total de notas de 100 reais a devolver é igual a " + exe16.decompNotas100());
        System.out.println("O total de notas de 10 reais a devolver é igual a " + exe16.decompNotas10());
        System.out.println("O total de moedas de 1 real a devolver é igual a " + exe16.decompMoedas1());
    }
}
