import java.util.Scanner;

public class ConverterTempFemC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um valor em Celcius: ");
        double fahrenheit = s.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("O valor de %.1f°F foi convertido em %.1f°C",
        fahrenheit, celsius);
    }
}