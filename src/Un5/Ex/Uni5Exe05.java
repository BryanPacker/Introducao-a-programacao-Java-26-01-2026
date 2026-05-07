package Un5.Ex;

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Qual o valor de n?");
        int x = 8;
        String resultado = "";
        int n = prompt.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                resultado = x+",";
            }
            else{
            if (i % 2 == 0) {
                resultado += (x+2)+",";
            }
            else{
                x = x * 2;
                resultado += x+",";
                }
            }
        }
        System.out.println(resultado);        
    }
}
