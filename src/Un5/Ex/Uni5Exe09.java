package Un5.Ex;

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int n = 0, input = 0, soma = 0;
        String nomeAluno = "";
        System.out.println("Quantos números você deseja fornecer de input?");
        n = prompt.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Qual a idade do "+i+" Aluno?");
            input = prompt.nextInt();
            System.out.println("Qual o nome do " + i + " aluno");
            nomeAluno = prompt.nextLine();

            if (input > 20) {
                soma++;
            }
            else if(input == 18){
                nomeAluno = nomeAluno + ",";
            }
        }
        System.out.println("Nome dos alunos que tem 18 anos: " + nomeAluno);
        System.out.println("Quantidade de alunos que tem a idade acima de 20 anos: " + soma);
    }
}
