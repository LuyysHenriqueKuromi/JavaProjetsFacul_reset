import java.util.Scanner;

public class AuladOr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int nota = s.nextInt();

        System.out.print("Digite a frequência do aluno: ");
        int frequenc = s.nextInt();

        if (nota >= 70 || frequenc >= 75) {
            //esse codigo só sera executado se a nota for maior ou igual a 70 OU a frequencia maior ou igual a 75
            System.out.print("Parabens, você foi aprovado");
        }else {
            System.out.print("Infelismente você foi reprovado, tente novamente no proximo semestre");
        }
    }
}
