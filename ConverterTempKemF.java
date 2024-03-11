import java.util.Scanner;

public class ConverterTempKemF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um valor em Kelvin: ");
        double kelvin = s.nextDouble();
        double fahrenheit = (kelvin - 273) * 1.8 + 32;

        System.out.printf("O valor de %.1f°K foi convertido em %.1f°F",
        kelvin, fahrenheit);
    }
}
