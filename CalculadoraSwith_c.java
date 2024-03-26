import java.util.Scanner;

public class CalculadoraSwith_c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float num1, num2, result;

        System.out.print("Digite o primeiro número: ");
        num1 = s.nextFloat();

        System.out.print("Digite o segundo número: ");
        num2 = s.nextFloat();

        s.nextLine();

        System.out.print("Digite a operação(+,-,/,*): ");
        String operac = s.nextLine();

        result = 0;

        switch (operac) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
            default:
                System.out.print("Digite dos símbolo mostrados");
                break;
        }

        System.out.printf("O resultado da conta deu: %2.2f",
        result);

    }
}
