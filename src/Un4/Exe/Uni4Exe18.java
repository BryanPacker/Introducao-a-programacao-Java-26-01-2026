package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        int venc, pag;
        float valorD = 0, prestvalor = 0;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Qual o dia do vencimento?");
        venc = prompt.nextInt();
        System.out.println("Qual o dia do pagamento?");
        pag = prompt.nextInt();
        System.out.println("Qual o valor da prestação?");
        prestvalor = prompt.nextInt();

        if (pag > 0 && pag <= venc){
            valorD = prestvalor * 0.9f;
            System.out.println(" O valor total pago foi de " + valorD + " e o pagamento está em dia");
        }
        if (pag > 0 && (pag > venc && pag <= (venc + 5))) {
            System.out.println("Você pagou o valor cheio!");
        }
        else {
            pag = pag - venc;
            prestvalor = pag * 0.02f * prestvalor + prestvalor;
            System.out.printf("O pagamento está atrasado %.0f",prestvalor);
        }
    }
}
