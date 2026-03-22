package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        int idade1, idade2, idade3;
        Scanner prompt = new Scanner(System.in);

        System.out.println("Qual a idade do zézinho");
        idade1 = prompt.nextInt();
        System.out.println("Qual a idade do marquinhos");
        idade2 = prompt.nextInt();
        System.out.println("Qual a idade da luluzinha");
        idade3 = prompt.nextInt();

        if (idade2 == idade1 && idade2 == idade3) {
            System.out.println("São trigêmeos");
        }
        else{
            if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3) {
                System.out.println("São gêmeos");
            }
            else{
                System.out.println("São apenas irmãos");
            }
        }
    }
}