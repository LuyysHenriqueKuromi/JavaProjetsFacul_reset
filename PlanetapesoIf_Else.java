import java.util.Scanner;

public class PlanetapesoIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite para onde você queira ir: [M]Marte/[L]Lua ");
        String lugar = s.nextLine();

        System.out.print("Digite o seu peso: ");
        float peso = s.nextFloat();

        float peso_lug = 0

        if (lugar.equals("M")) {
            peso_lug = (peso / 9.81) * 1.62;
        }else if (lugar.equals("F")) {
            peso_lug = (peso / 9.81) * 3.71;
        }else {
            System.out.print("ERRO");
        }
    }
}
