import java.util.Scanner;

public class ConverterTempFemK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um valor em Fahrenheit: ");
        double fahrenheit = s.nextDouble();
        double kelvin = (fahrenheit - 32) / 1.8 + 273;

        System.out.printf("O valor de %.1f°F foi convertido em %.1f°K",
        fahrenheit, kelvin);
    }
}
