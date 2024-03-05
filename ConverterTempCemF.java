import java.util.Scanner;

public class ConverterTempCemF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um valor em Celcius: ");
        double celsius = s.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("O valor de %.1f°C foi convertido em %.1f°F",
        celsius, fahrenheit);
    }
}
