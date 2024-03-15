import java.util.Scanner;

public class CinemaValorIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dia, idade, valor_ing, carteira;

        System.out.print("Qual dia da semana gostaria de ir? ");
        System.out.print("Segunda[1] Terça[2] Quarta[3] Quinta[4] Sexta[5] Sabado[6] Domingo[7]");
        dia = s.nextInt();

        System.out.print("Qual a sua idade? ");
        idade = s.nextInt();

        System.out.print("Você tem carteira de meio ingresso? Sim[1] Não");
        carteira = s.nextInt();

        if (dia == 1 || dia == 2 || dia == 4) {
            valor_ing = 20;
        } else if (dia == 3) {
            valor_ing = 16;
        } else if (dia == 5 || dia == 6 || dia == 7) {
            valor_ing = 26;
        }



        if (idade < 18 || )

    }
}
