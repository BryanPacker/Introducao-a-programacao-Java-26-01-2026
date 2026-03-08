package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
       
        Scanner prompt = new Scanner(System.in);
        double x1, x2, y1, y2; 

        System.out.print("Qual o valor do primeiro ponto de 'X'? ");
        x1 = prompt.nextDouble();
        System.out.print("Qual o valor do segundo ponto de 'X'? ");
        x2 = prompt.nextDouble();
        System.out.print("Qual o valor do primeiro ponto de 'Y'? ");
        y1 = prompt.nextDouble();
        System.out.print("Qual o valor do segundo ponto de 'Y'? ");
        y2 = prompt.nextDouble();

        prompt.close();
        
        double distancia, xFinal, yFinal, preRaiz; 
        distancia  = (x1 - x2);
        xFinal = Math.pow(distancia, 2);
        distancia = (y1 - y2);
        yFinal = Math.pow(distancia, 2);
        preRaiz = yFinal + xFinal;
        distancia  = Math.sqrt(preRaiz);

        System.out.printf("A distância entre os dois pontos do plano cartesiano é igual a: %.4f", distancia);
    }
}
/* Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre
 eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:*/