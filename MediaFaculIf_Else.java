import java.util.Scanner;

public class MediaFaculIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a primeiro note da A1: ");
        float notaA1 = s.nextFloat();

        System.out.print("Digite a segunda nota da A2: ");
        float notaA2 = s.nextFloat();

        System.out.print("Digite a terceira nota da A3: ");
        float notaA3 = s.nextFloat();

        float media = notaA1 + notaA2 + notaA3;

        if (media >= 70) {
            System.out.println("Parabéns!! Você foi aprovado!");
        }else {
            System.out.println("Você foi reprovado! =('')");
        }
    }
}
