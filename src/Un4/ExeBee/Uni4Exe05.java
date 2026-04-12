package Un4.ExeBee;
import java.util.Scanner;
public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int inicio, duracao, fim;
        inicio = prompt.nextInt();
        fim = prompt.nextInt();
        if (inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}

