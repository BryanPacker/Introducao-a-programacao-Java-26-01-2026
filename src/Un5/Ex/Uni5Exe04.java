package Un5.Ex;

public class Uni5Exe04 {
    public static void main(String[] args) {
        double divs = 0, numerador = 3, denominador = 0;
        
        for (int i = 1; i <= 20 ; i++) {
            numerador = numerador + 2;
            denominador = i * (i+1);
            divs = divs + (numerador / denominador);
        }
        System.out.printf("O valor de S é igual a: %.2f", divs);
    }
}
