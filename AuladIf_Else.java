import java.util.Scanner;

public class AuladIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ditite a nota do aluno: ");
        float nota = s.nextFloat();

        if (nota >= 70) {
            System.out.println("parabéns!! Você foi aprovado");
        }else {
            System.out.println("Você foi reprovado! =('')");
        }
    }
}
