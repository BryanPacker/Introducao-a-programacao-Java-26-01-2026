import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        System.out.println("Aula 25/02/2026");

        // Váriaveis
        // float prova1 = 0f;
        // float prova2 = 0f;
        // float trabalhoFinal = 0f;

        // Cálculos de Média Aritmética / Ponderada
        // float mediaTrabalhos = (10 + 8.5f + 0 + 5 + 10 + 9.8f + 9.5f) / 7;
        // float mediaFinal = (prova1 * 0.2f) + (prova2 * 0.3f) + (trabalhoFinal * 0.3f)
        // + (mediaTrabalhos * 0.2f);

        // Médias Aluno
        // System.out.println("A média final do semestre é igual a: " + mediaFinal);
        // System.out.println("A média final dos trabalhos é igual a: " +
        // mediaTrabalhos);

        // Váriaveis prova
        float prova1;
        float prova2;
        float trabalhoFinal;

        Scanner terminal = new Scanner(System.in);

        // Inputs
        System.out.println("Digite a nota da prova 1: ");
        prova1 = terminal.nextFloat();

        System.out.println("Digite a nota da prova 2: ");
        prova2 = terminal.nextFloat();

        System.out.println("Digite a nota do Trabalho Final: ");
        trabalhoFinal = terminal.nextFloat();

        // Váriaveis trabalhos
        float trabalhoun1;
        float trabalhoun2;
        float trabalhoun3;
        float trabalhoun4;
        float trabalhoun5;
        float trabalhoun6;
        float trabalhoun7;

        // Inputs
        System.out.println("Digite a nota do trabalho 1: ");
        trabalhoun1 = terminal.nextFloat();

        System.out.println("Digite a nota do trabalho 2: ");
        trabalhoun2 = terminal.nextFloat();

        System.out.println("Digite a nota do trabalho 3: ");
        trabalhoun3 = terminal.nextFloat();

        System.out.println("Digite a nota do trabalho 4: ");
        trabalhoun4 = terminal.nextFloat();

        System.out.println("Digite a nota do trabalho 5: ");
        trabalhoun5 = terminal.nextFloat();

        System.out.println("Digite a nota do trabalho 6: ");
        trabalhoun6 = terminal.nextFloat();

        System.out.println("Digite a nota do trabalho 7: ");
        trabalhoun7 = terminal.nextFloat();

        terminal.close();
        
        // Cálculos de Média Aritmética / Ponderada
        float mediaTrabalhos = (trabalhoun1 + trabalhoun2 + trabalhoun3 + trabalhoun4 + trabalhoun5 + trabalhoun6 + trabalhoun7) / 7;
        float mediaFinal = (prova1 * 0.2f) + (prova2 * 0.3f) + (trabalhoFinal * 0.3f) + (mediaTrabalhos * 0.2f);
        float provas = (prova1 + prova2) / 2;

        float mTFormat = new BigDecimal(mediaTrabalhos).setScale(2, RoundingMode.HALF_UP).floatValue();
        float provaFormat = new BigDecimal(provas).setScale(2, RoundingMode.HALF_UP).floatValue();
        float tFFormat = new BigDecimal(trabalhoFinal).setScale(2, RoundingMode.HALF_UP).floatValue();
        float mFFormat = new BigDecimal(mediaFinal).setScale(2, RoundingMode.HALF_UP).floatValue();
        DecimalFormat df = new DecimalFormat("0.00");
        // Médias Aluno
        System.out.println("A média final dos trabalhos é igual a: " + mTFormat);
        System.out.println("A média final das provas é igual a: " + provaFormat);
        System.out.println("A média final do trabalho final é igual a: " + tFFormat);
        System.out.println("A média final do semestre é igual a: " + mFFormat);
        System.out.println("A média final do semestre é igual a: " + mediaFinal);
        System.out.printf("A média final do semestre é igual a: %.2f%n", mediaFinal,"%n");
        System.out.printf("A média final do semestre é igual a: " +  df.format(mediaFinal));

        if (mFFormat < 6) {
            System.out.println("Reprovado");
        }
        else {
            System.out.println("Aprovado");
        }
    }
}
