import java.util.Scanner;

public class AlunMediaIf_Else_ElseIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        float nota = s.nextFloat();

        if (nota >= 7) {
            System.out.println("Aprovado");
        }else if (nota >= 6 && nota < 7) {
            System.out.println("Aluno aprovado na final com a nota");
        }else if (nota < 6) {
            System.out.println("Aluno reprovado com a nota");
        }
    }
}
