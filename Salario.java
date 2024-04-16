import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double salar_min, salar_total, aum_salar;
        System.out.print("Quantos salerios você recebe? ");
        float salar_quant = s.nextFloat();
        salar_min = 1412.00;
        salar_total = salar_quant * salar_min;
        aum_salar = salar_total * 1.10;
        
        System.out.printf("O seu salário teve um aumento de 10 porcento, de R$%2.2f, foi para R$%2.2f"
                ,salar_total, aum_salar);
        
    }
}
