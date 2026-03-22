package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        int idade1, idade2, idade3;
        Scanner prompt = new Scanner(System.in);

        System.out.println("Qual a idade do zézinho");
        idade1 = prompt.nextInt();
        System.out.println("Qual a idade do marquinhos");
        idade2 = prompt.nextInt();
        System.out.println("Qual a idade da luluzinha");
        idade3 = prompt.nextInt();

        if (idade1 < idade2 && idade1 < idade3) {
            System.out.println("O zézinho é o mais novo");
        }
        else{
            if (idade2 < idade1 && idade2 < idade3) {
                System.out.println("O marquinhos é o mais novo");
            }
            else{
                System.out.println("A luluzinha é a mais nova");
            }
        }
    }
}
