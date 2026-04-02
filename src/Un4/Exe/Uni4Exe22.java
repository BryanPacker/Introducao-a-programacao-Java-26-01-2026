package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n;
        System.out.println("Digite o número referente ao título");
        n = p.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Número incorreto");
                break;
        }
    }
}
