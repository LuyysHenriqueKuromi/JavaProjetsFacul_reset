import java.util.Scanner;

public class LerDatPorExtenSwith_c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dia, mes, ano;

        System.out.print("Escreva uma data: 00/00/0000\n");

        System.out.print("Digite um dia: ");
        dia = s.nextInt();

        System.out.print("Digite um mês: ");
        mes = s.nextInt();

        System.out.print("Digite um ano: ");
        ano = s.nextInt();

        String mes_nome = "nulo";

        switch (mes) {
            case 1:
                mes_nome = "Janeiro";
                break;
            case 2:
                mes_nome = "Fevereiro";
                break;
            case 3:
                mes_nome = "Março";
                break;
            case 4:
                mes_nome = "Abril";
                break;
            case 5:
                mes_nome = "Maio";
                break;
            case 6:
                mes_nome = "Junho";
                break;
            case 7:
                mes_nome = "Julho";
                break;
            case 8:
                mes_nome = "Agosto";
                break;
            case 9:
                mes_nome = "Setembro";
                break;
            case 10:
                mes_nome = "Outubro";
                break;
            case 11:
                mes_nome = "Novembro";
                break;
            case 12:
                mes_nome = "Dezembro";
                break;
            default:
                System.out.print("O mês deve ser entre 1 e 12");
                break;
        }

        System.out.printf("%d de %s de %d",
        dia, mes_nome, ano);
    }
}