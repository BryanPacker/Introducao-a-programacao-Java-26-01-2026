package Un4;

import java.util.Scanner;

public class Ex1javaCondicao {
    private float nota1;
    private float nota2;
    private float nota3;

    public Ex1javaCondicao(float nota1, float nota2, float nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float calculoMedia(){
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public static void main(String[] args) {
        float media, nota1, nota2, nota3;
        Scanner prompt = new Scanner(System.in);
        int frequencia;

        System.out.println("Qual a média minima para aprovação da sua instituição de ensino?");
        media = prompt.nextFloat();
        System.out.println("Qual sua frequência total no semestre? Use somente números na resposta");
        frequencia = prompt.nextInt();

        System.out.println("Qual sua primeira nota?");
        nota1 = prompt.nextFloat();
        System.out.println("Qual sua segunda nota?");
        nota2 = prompt.nextFloat();
        System.out.println("Qual sua terceira nota?");
        nota3 = prompt.nextFloat();
        prompt.close();

        Ex1javaCondicao exe01un4 = new Ex1javaCondicao(nota1, nota2, nota3);
        float mediaFinal = exe01un4.calculoMedia();
        
        
        if (mediaFinal >= media && frequencia >= 75) {
            System.out.printf("Parabéns, você foi aprovado! Sua média final é igual a %.2f com uma frequência igual a %d%%", mediaFinal, frequencia);
        }
        else{
            System.out.printf("Você infelizmente foi reprovado, sua média final foi igual %.2f com uma frequência de %d%%", mediaFinal, frequencia);
        }
    }
}
