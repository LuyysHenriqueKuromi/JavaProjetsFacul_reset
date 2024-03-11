import java.util.Scanner;

public class ConverterTempKemC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um valor em Kelvin: ");
        double kelvin = s.nextDouble();
        double celsius = kelvin - 273;

        System.out.printf("O valor de %.1f°K foi convertido em %.1f°C",
        kelvin, celsius);
    }
}
