import java.util.Scanner;                                                       
                                                                                
public class CalcularGastos {                                                              
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor dos gastos em janeiro: ");
        float valor1 = s.nextFloat();

        System.out.print("Agora o de favereiro: ");
        float valor2 = s.nextFloat();

        System.out.print("Por ultimo o de março: ");
        float valor3 = s.nextFloat();

        System.out.printf("A soma total do primeiro trimestre foi R$%.2f",
        (valor1 + valor2 + valor3));

        System.out.printf(" e a media foi R$%.2f",
        (valor1 + valor2 + valor3) / 3);
        
    }
}