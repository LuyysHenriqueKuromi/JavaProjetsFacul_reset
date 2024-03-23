import java.util.Scanner;

public class DistanciaCartes {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        float a1x, a1y, b2x, b2y, valor1, valor2;
        double preresult, result;

        System.out.print("Digite o valor de X no ponto A: ");
        a1x = s.nextFloat();

        System.out.print("Digite o valor de Y no ponto A: ");
        a1y = s.nextFloat();

        System.out.print("Digite o valor de X no ponto B: ");
        b2x = s.nextFloat();

        System.out.print("Digite o valor de Y no ponto B: ");
        b2y = s.nextFloat();

        valor1 = (b2x - a1x);

        valor2 = (b2y - a1y);
        
        preresult = Math.pow(valor1, 2) +  Math.pow(valor2, 2);

        result = Math.sqrt(preresult);

        System.out.printf("A distância dos pontos A e B, é %2.1f"
                , result);

    }
}
