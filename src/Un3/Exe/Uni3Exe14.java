package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe14 {
    private float distancia;
    private float tempoGasto;
    private float gastosLitro;
    
    public Uni3Exe14(float distancia, float tempoGasto, float gastosLitro){
        this.tempoGasto = tempoGasto;
        this.distancia = distancia;
        this.gastosLitro = gastosLitro;
    }
    public float velocidadeMedia(){
        return this.distancia / this.tempoGasto;
    }
    public float gastosGasolina(){
        return this.distancia / this.gastosLitro;
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        float distancia, tempoGasto, gastosLitro;

        System.out.println("Qual a distância total percorrida em KM's? (formato aceito X / X,XX)");
        distancia = prompt.nextFloat();
        
        System.out.println("Qual o tempo total gasto na corrida em minutos? (formato aceito X / X,XX)");
        tempoGasto = prompt.nextFloat();

        System.out.println("Em média, quantos quilomêtros seu carro faz por litro de gasolina? (formato aceito X / X,XX)");
        gastosLitro = prompt.nextFloat();

        Uni3Exe14 exe14 = new Uni3Exe14(distancia, tempoGasto, gastosLitro);
        System.out.printf("A velocidade média da viagem foi igual a %.2fKM/h com um gasto total de %.2f litros de gasolina", exe14.velocidadeMedia(), exe14.gastosGasolina());
    }
}
