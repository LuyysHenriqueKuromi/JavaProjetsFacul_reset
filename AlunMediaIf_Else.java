import java.util.Scanner;

public class AlunMediaIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        float nota = s.nextFloat();

        if (nota >= 7) {
            System.out.println("Aluno aprovado com a nota");
        }else {
            System.out.println("Reprovado");
        }
    }
}
