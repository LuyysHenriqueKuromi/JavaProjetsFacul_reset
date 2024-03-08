import java.util.Scanner;

public class DistanciaCartes {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor de X no ponto A: ");
        float a1x = s.nextFloat();

        System.out.print("Digite o valor de Y no ponto A: ");
        float a1y = s.nextFloat();

        System.out.print("Digite o valor de X no ponto B: ");
        float b2x = s.nextFloat();

        System.out.print("Digite o valor de Y no ponto B: ");
        float b2y = s.nextFloat();

        float valor1 = (b2x - a1x);

        float valor2 = (b2y - a1y);
        
        double preresult = Math.pow(valor1, 2) +  Math.pow(valor2, 2);

        double result = Math.sqrt(preresult);

        System.out.printf("A distância dos pontos A e B, é %2.1f"
                , result);

    }
}    
