package Un3;

public class Operador {
    public static void main(String[] args) {
        // Não persiste na variavel
        String texto = "Oi tudo bem?";
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        // Persiste na variavel
        String textop = "Olá".toLowerCase();
        String textop2 = "Olá".toUpperCase();
        System.out.println(textop);
        System.out.println(textop2);

        boolean ehPalavra = false;
        ehPalavra = (texto.toUpperCase().equals("Oi tudo bem?".toUpperCase()));
        System.out.println(ehPalavra);
        int num = 0;

        // num++ = x + 1
        num++;
        ++num;
        
        // num++ = x - 1
        num--;        
        --num;

        int x = 0;
        int y = 0;
        
        // x = x + y
        x+=y;

        // x = x - y
        x-=y;

        // x = x * y
        x*=y;

        // x = x / y
        x/=y;

        // x = x % y
        x%=y;

    }
}
