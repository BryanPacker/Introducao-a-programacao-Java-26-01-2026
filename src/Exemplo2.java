public class Exemplo2 {
    public static void main(String[] args) {
        System.out.println("Aula 25/02/2026");

        // Váriaveis
        float prova1 = 0f;
        float prova2 = 0f;
        float trabalhoFinal = 0f;

        // Cálculos de Média Aritmética / Ponderada
        float mediaTrabalhos = (10 + 8.5f + 0 + 5 + 10 + 9.8f + 9.5f) / 7;
        float mediaFinal = (prova1 * 0.2f) + (prova2 * 0.3f) + (trabalhoFinal * 0.3f) + (mediaTrabalhos * 0.2f);

        // Médias Aluno
        System.out.println("A média final do semestre é igual a: " + mediaFinal);
        System.out.println("A média final dos trabalhos é igual a: " + mediaTrabalhos);
    }
}
