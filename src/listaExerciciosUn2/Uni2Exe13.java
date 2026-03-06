package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        float kmDistancia, tmpDistancia;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Quantos Km's você quer calcular?");
        kmDistancia = prompt.nextFloat();
        prompt.close();
        tmpDistancia = kmDistancia * 2;
        System.out.println("O carro y vai demorar um total de: " + tmpDistancia + " minutos para essa distância do outro carro");

    }
}
/* Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h. Em uma hora 
(60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.
 Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
*/