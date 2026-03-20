package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe04 {
    
    private float nota1;
    private float nota2;
    private float nota3;

    public Uni3Exe04(float nota1, float nota2, float nota3){

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    public float calculoPonderada(){
        return ((this.nota1 * 5) + (this.nota2 * 3) + (this.nota3 * 2)) / (5 + 3 + 2);
    }

    public static void main(String[] args) {
        Float nota1, nota2, nota3;
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota que tem um peso igual a 5 pontos");
        nota1 = prompt.nextFloat();
        System.out.println("Digite sua primeira nota que tem um peso igual a 3 pontos");
        nota2 = prompt.nextFloat();
        System.out.println("Digite sua primeira nota que tem um peso igual a 2 pontos");
        nota3 = prompt.nextFloat();
        prompt.close();

        Uni3Exe04 exe04 = new Uni3Exe04(nota1, nota2, nota3);

        System.out.println("Sua nota final é igual a " + exe04.calculoPonderada());
        
    }

}
