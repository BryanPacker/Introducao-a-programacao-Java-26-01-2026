package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        String vogal;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite uma letra");
        vogal = prompt.next();
        if (vogal.equalsIgnoreCase("a") || vogal.equalsIgnoreCase("e") || vogal.equalsIgnoreCase("i") || vogal.equalsIgnoreCase("o") || vogal.equalsIgnoreCase("u")) {
            System.out.println("É vogal");
        }
        else{
            System.out.println("Não é vogal");
        }
    }
}
