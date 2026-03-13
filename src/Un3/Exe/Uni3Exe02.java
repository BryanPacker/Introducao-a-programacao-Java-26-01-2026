package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe02 {
    
    // Atributos
    private float valorCalcado; 
    private int percentualDesconto = 12;
    
    // Construtor
    public Uni3Exe02(float valorCalcado, int percentualDesconto){
        this.valorCalcado = valorCalcado;
        this.percentualDesconto = percentualDesconto;
    }

    public float calcularDesconto(){
        return this.valorCalcado * 0.12f;
    }

    public float calcularValorFinal(){
        return this.valorCalcado - this.calcularDesconto();
    }
    public static void main(String[] args) {
        
        Scanner prompt = new Scanner(System.in);
        float valorCalcado, valorDesconto;

        System.out.println("Qual o valor do calçado?");
         valorCalcado = prompt.nextFloat();
        prompt.close();

        Uni3Exe02 clasExe02 = new Uni3Exe02(valorCalcado, 12);
        valorCalcado = clasExe02.calcularValorFinal();
        valorDesconto = clasExe02.calcularDesconto();

        System.out.printf("O valor de desconto obtido foi de: %.2f%n", valorDesconto);
        System.out.printf("O valor final do calçado foi de: %.2f", valorCalcado);
    }
}
