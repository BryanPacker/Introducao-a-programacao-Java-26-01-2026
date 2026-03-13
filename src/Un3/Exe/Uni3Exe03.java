package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe03 {
    private float precoCombustivel;
    private float valorPagamento;

    public Uni3Exe03(float precoCombustivel, float valorPagamento){

        this.precoCombustivel = precoCombustivel;
        this.valorPagamento = valorPagamento;
    
    }

    public float qntCombustivel(){

        return this.valorPagamento / this.precoCombustivel; 
    
    }
    public static void main(String[] args) {
        
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Qual o valor do pagamento? ");
        float valorPagamento = prompt.nextFloat();
        System.out.println("Qual o valor do combustível? ");
        float precoCombustivel = prompt.nextFloat();
        prompt.close();

        Uni3Exe03 exe03 = new Uni3Exe03(precoCombustivel, valorPagamento);
        float qntCombustivel = exe03.qntCombustivel();

        System.out.printf("A quantidade total de gasolina adquirida é igual a: %.2f", qntCombustivel);
    }
}
