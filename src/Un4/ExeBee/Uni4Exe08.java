package Un4.ExeBee;
    import java.util.Scanner;

public class Uni4Exe08 {
            public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        double salario = prompt.nextDouble();

        double imposto = 0;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } 
        else {
            if (salario > 4500.00) {
                imposto += (salario - 4500.00) * 0.28;
                salario = 4500.00;
            }
            if (salario > 3000.00) {
                imposto += (salario - 3000.00) * 0.18;
                salario = 3000.00;
            }
            if (salario > 2000.00) {
                imposto += (salario - 2000.00) * 0.08;
            }
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}

