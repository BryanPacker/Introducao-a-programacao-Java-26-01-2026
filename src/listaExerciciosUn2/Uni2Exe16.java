package listaExerciciosUn2;

import java.util.Scanner;

class Uni2Exe16 {
    public static void main(String[] args) {

        int doisLitros, seiscentosMl, trezentos50Ml, mlFinal;
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Informe a Quatidade de garrafas de dois litros compradas: ");
        doisLitros = prompt.nextInt();
        System.out.println("Informe a quantidade de garrafas de 600ml compradas: ");
        seiscentosMl = prompt.nextInt();
        System.out.println("Informe a quantidade de latinhas de 350ml compradas: ");
        trezentos50Ml = prompt.nextInt();
        
        prompt.close();

        doisLitros = doisLitros * 2000;
        trezentos50Ml = trezentos50Ml * 350;
        seiscentosMl = seiscentosMl * 600;
        mlFinal = (doisLitros + trezentos50Ml + seiscentosMl ) % 1000;
        int litragemFinal = (doisLitros + trezentos50Ml + seiscentosMl - mlFinal) / 1000;
        
        System.out.println("A quantidade total obtida na compra é de: " + litragemFinal + " litros e " + mlFinal + "ml's");

    }
}
/*Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
 Se um comerciante compra uma determinada quantidade de cada formato, informe quantos litros de refrigerante ele comprou.*/