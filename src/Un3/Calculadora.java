package Un3;

public class Calculadora {
    
    private int numeroUm, numeroDois, resultado;
    //Construtor da classe
    public Calculadora(int numeroUm, int numeroDois){
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public int somar(){
        return this.numeroUm + this.numeroDois;
    } 
    
    public int somaDoisNumeros(int num1, int num2){
        return num1 + num2; 
    }
    
    public void obterNumeros(){

    }   
    public static void main(String[] args) {
       
        Calculadora calc = new Calculadora(1, 2);
        
        int valor = calc.somaDoisNumeros(10, 5);
        System.out.println(valor);
      
        valor = calc.somaDoisNumeros(7, 88);
        System.out.println(valor);

        valor = calc.somar();
        System.out.println(valor);
    }
}
