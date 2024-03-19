import java.util.Scanner;

public class LerDataPorExtenso {
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

        if (mes == 1) {
            mes_nome = "janeiro";
        }else if (mes == 2) {
            mes_nome = "fevereiro";
        }else if (mes == 3) {
            mes_nome = "março";
        }else if (mes == 4) {
            mes_nome = "abril";
        }else if (mes == 5) {
            mes_nome = "maio";
        }else if (mes == 6) {
            mes_nome = "junho";
        }else if (mes == 7) {
            mes_nome = "julho";
        }else if (mes == 8) {
            mes_nome = "agosto";
        }else if (mes == 9) {
            mes_nome = "setembro";
        }else if (mes == 10) {
            mes_nome = "outubro";
        }else if (mes == 11) {
            mes_nome = "novembro";
        }else if (mes == 12) {
            mes_nome = "dezembro";
        }else {
            System.out.print("ERRO");
        }

        System.out.printf("%d de %s de %d",
        dia, mes_nome, ano);
    }
}
