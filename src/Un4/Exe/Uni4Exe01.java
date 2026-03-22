package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe01 {
    private float valorHora;
    private float horasTrabalhadas;
    private float horasExtras;

    public Uni4Exe01(float valorHora, float horasTrabalhadas, float horasExtras){
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtras = horasExtras;
    }
    
    public float valorSalarioNormal(){
        return this.valorHora * this.horasTrabalhadas;
    }
    public float valorSalarioHoraExtra(){
        return (this.valorHora * 1.5f) * this.horasExtras;
    }
    public float valorSalarioFinalCHora(){
        return this.valorSalarioNormal() + this.valorSalarioHoraExtra();
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        float valorHora, horasTrabalhadas, horasExtras = 0;

        System.out.println("Qual seu ganho por hora");
        valorHora = prompt.nextFloat();
        System.out.println("Quantas horas foram trabalhadas no mês");
        horasTrabalhadas = prompt.nextFloat();
        prompt.close();
        if (horasTrabalhadas > 160) {
            horasExtras = horasTrabalhadas - 160;
            horasTrabalhadas = horasTrabalhadas - horasExtras;
        }

        Uni4Exe01 exe01 = new Uni4Exe01(valorHora, horasTrabalhadas, horasExtras);
        if (horasTrabalhadas >= 160) {
            System.out.printf("Você ganhara essa semana %.2f reais por seu trabalho", exe01.valorSalarioFinalCHora() );
        }
        else{
            System.out.printf("Você ganhará essa semana %.2f reais por seu trabalho", exe01.valorSalarioNormal());
        }
    }
}
