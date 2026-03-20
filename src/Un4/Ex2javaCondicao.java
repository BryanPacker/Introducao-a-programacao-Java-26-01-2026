package Un4;

import java.util.Scanner;

public class Ex2javaCondicao {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int idadePessoa;
        boolean EhEstudante, EhDoador;
        
        System.out.println("Qual a sua idade?");
        idadePessoa = prompt.nextInt();
        System.out.println("Você é doador?");
        EhDoador = false;
        String respostaDoador = prompt.next();
        if (respostaDoador.equalsIgnoreCase("Sim") || respostaDoador.equalsIgnoreCase("S")) {
            EhDoador = true;
        }
        System.out.println("Você é estudante?");
        EhEstudante = false;
        String respostaEstudante = prompt.next();
        if (respostaEstudante.equalsIgnoreCase("Sim") || respostaEstudante.equalsIgnoreCase("S")) {
            EhEstudante = true;
        }
        if (idadePessoa <=17 || idadePessoa >=60) {
            System.out.println("Você tem direito a meia entrada");
        }

        else{
            if (EhDoador || EhEstudante) {
                System.out.println("Você tem direito a meia entrada");
            }
            else{
                System.out.println("Você não tem direito a meia entrada");
            }   
        }
        
    }
}
