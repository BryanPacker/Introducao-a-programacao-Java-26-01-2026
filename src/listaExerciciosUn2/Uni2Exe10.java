package listaExerciciosUn2;

import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
    
        int secs, horas, minutos;
        Scanner prompt = new Scanner(System.in);
       
        System.out.println("Quantos segundos o evento durou? ");
        secs = prompt.nextInt();
      
        minutos = (secs % 3600) / 60;
        horas = secs / 3600;
        secs = secs % 60;
     
        System.out.println("O evento teve uma duração total de " + horas + ":" + minutos + ":" + secs);

    }
}
