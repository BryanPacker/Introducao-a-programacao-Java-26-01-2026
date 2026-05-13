package Un5.Ex;

import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
        int qnt = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                int soma = i + j;
                int total= (int)Math.pow(soma, 2);
                String totalS = total+"";
                String conc = i+""+j;
                if (conc.equals(totalS)) {
                    qnt++;
                    System.out.println(conc);
                }
                if (qnt ==10) {
                    break;
                }
            }
        }
    }
}
