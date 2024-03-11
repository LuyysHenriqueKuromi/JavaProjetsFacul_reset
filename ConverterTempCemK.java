import java.util.Scanner;

public class ConverterTempCemK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um valor em Celcius: ");
        double celsius = s.nextDouble();
        double kelvin = celsius + 273;

        System.out.printf("O valor de %.1f°C foi convertido em %.1f°K",
        celsius,kelvin);
    }
}
