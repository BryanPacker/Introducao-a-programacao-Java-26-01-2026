package Un3.Exe;

import java.util.Scanner;

public class Uni3Exe11 {
    private int tempC;

    public Uni3Exe11(int tempC){
        this.tempC = tempC;
    }
    public float tempF(){
        return (9f/5f) * tempC + 32f;
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int tempC;
        System.out.println("Qual a temperatura em Cº?");
        tempC = prompt.nextInt();
        Uni3Exe11 exe11 = new Uni3Exe11(tempC);
        System.out.printf("A temperatura em Fahrenheit é igual a %f", exe11.tempF());
    }
}
