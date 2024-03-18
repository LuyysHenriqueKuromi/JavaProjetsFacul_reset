import java.util.Scanner;

public class CinemaValorIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dia, idade, valor_ing, carteira, valor_final;

        System.out.print("Qual dia da semana gostaria de ir? ");
        System.out.print("Segunda[1] Terça[2] Quarta[3] Quinta[4] Sexta[5] Sabado[6] Domingo[7] ");
        dia = s.nextFloat();

        System.out.print("Qual a sua idade? ");
        idade = s.nextFloat();

        System.out.print("Você tem carteira de meio ingresso? Sim[1] Não[2] ");
        carteira = s.nextFloat();

        valor_ing = 0;

        String dia_nome = "nulo";

        if (dia == 1) {
            dia_nome = "Segunda";
        }else if (dia == 2) {
            dia_nome = "Terça";
        }else if (dia == 3) {
            dia_nome = "Quarta";
        }else if (dia == 4) {
            dia_nome = "Quinta";
        }else if (dia == 5) {
            dia_nome = "Sexta";
        }else if (dia == 6) {
            dia_nome = "Sabado";
        }else if (dia == 7) {
            dia_nome = "Domingo";
        }

        if (dia == 1 || dia == 2 || dia == 4) {
            valor_ing = 20;
        }else if (dia == 3) {
            valor_ing = 16;
        }else if (dia == 5 || dia == 6 || dia == 7) {
            valor_ing = 26;
        }else if (dia > 7) {
            System.out.print("Erro");
        }

        if (idade < 18 || carteira == 1) {
            valor_final = valor_ing / 2;
        }else {
            valor_final = valor_ing;
        }

        System.out.printf("O ingresso no dia de %s vai custar R$%2.2f",
        dia_nome, valor_final);
    }
}
