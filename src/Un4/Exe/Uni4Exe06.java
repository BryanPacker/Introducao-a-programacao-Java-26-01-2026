package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        String sexo;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite m para o sexo masculino, f para feminino e i para não informar");
        sexo = prompt.next();
        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        }
        else{
            if (sexo.equalsIgnoreCase("F")) {
             System.out.println("Feminino");   
            }
            else{
                if (sexo.equalsIgnoreCase("I")) {
                    System.out.println("Não informado");
                }
                else{
                    System.out.println("Caracter invalido");
                }
            }
        }
    }
}
