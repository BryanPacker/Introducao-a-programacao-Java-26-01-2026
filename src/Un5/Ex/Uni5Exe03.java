package Un5.Ex;

public class Uni5Exe03 {
    public static void main(String[] args) {
        double x = 0;
        for (int i = 1; i <= 100; i++) {
            x = x + (1f / i);
        }
        System.out.printf("Valor total da soma = %.2f", x);
    }
}
