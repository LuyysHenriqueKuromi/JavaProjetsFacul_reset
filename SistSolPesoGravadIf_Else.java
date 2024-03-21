import java.util.Scanner;

public class SistSolPesoGravadIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double peso, peso_lug;
        String lugar, astro_nome, complemento;

        System.out.print("Digite o seu peso: ");
        peso = s.nextFloat();
        s.nextLine();

        System.out.print("Lua[L] / Mercúrio[Me] / Vênus[Ve] / Marte[Ma] / Júpitar[Ju] / Saturno[Sa] / Urano[Ur] / Netuno[Ne] / Plutão[Pl]\n");
        System.out.print("Para qual corpo celeste você quer ir? ");
        lugar = s.nextLine();

        peso_lug = 0;
        astro_nome = "nulo";
        complemento = "nulo";

        if (lugar.equals("Lu")) {
            peso_lug = (peso / 9.81) * 1.62;
            astro_nome = "Lua";
        }else if (lugar.equals("Me")) {
            peso_lug = peso / 9.81 * 3.7;
            astro_nome = "Mercúrio";
        }else if (lugar.equals("Ve")) {
            peso_lug = peso / 9.81 * 8.87;
            astro_nome = "Vênus";
        }else if (lugar.equals("Ma")) {
            peso_lug = peso / 9.81 * 3.711;
            astro_nome = "Marte";
        }else if (lugar.equals("Ju")) {
            peso_lug = peso / 9.81 * 24.79;
            astro_nome = "Júpiter";
        }else if (lugar.equals("Sa")) {
            peso_lug = peso / 9.81 * 10.44;
            astro_nome = "Saturno";
        }else if (lugar.equals("Ur")) {
            peso_lug = peso / 9.81 * 8.87;
            astro_nome = "Urano";
        }else if (lugar.equals("Ne")) {
            peso_lug = peso / 9.81 * 11.15;
            astro_nome = "Netuno";
        }else if (lugar.equals("Pl")) {
            peso_lug = peso / 9.81 * 0.62;
            astro_nome = "Plutão";
        }

        if (astro_nome.equals("Lua")) {
            complemento = "na";
        }else {
            complemento = "em";
        }

        System.out.printf("O seu peso que é de %.2f kg na Terra, viram %.2f kg %s %s",
        peso, peso_lug, complemento, astro_nome);
    }
}
