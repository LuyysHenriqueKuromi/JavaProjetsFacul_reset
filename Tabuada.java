import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número para saber sua tabuada: ");
        float valor = s.nextFloat();
                
        System.out.printf("%.1f x 1 = %.1f \n", valor, valor * 1);
        System.out.printf("%.1f x 2 = %.1f \n", valor, valor * 2);
        System.out.printf("%.1f x 3 = %.1f \n", valor, valor * 3);
        System.out.printf("%.1f x 4 = %.1f \n", valor, valor * 4);
        System.out.printf("%.1f x 5 = %.1f \n", valor, valor * 5);
        System.out.printf("%.1f x 6 = %.1f \n", valor, valor * 6);
        System.out.printf("%.1f x 7 = %.1f \n", valor, valor * 7);
        System.out.printf("%.1f x 8 = %.1f \n", valor, valor * 8);
        System.out.printf("%.1f x 9 = %.1f \n", valor, valor * 9);
        System.out.printf("%.1f x 10 = %.1f \n", valor, valor * 10);
    }
}
