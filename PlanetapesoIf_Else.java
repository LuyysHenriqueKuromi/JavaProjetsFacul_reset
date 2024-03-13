import java.util.Scanner;

public class PlanetapesoIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        float peso = s.nextFloat();

        System.out.print("Para qual corpo celeste você quer ir? Lua[L]/Marte[M]: ");
        String lugar = s.nextLine();

        float peso_lug = 0

        if (lugar.equals("L")) {
            peso_lug = (peso / 9.81) * 1.62;
        }else if (lugar.equals("M")) {
            peso_lug = (peso / 9.81) * 3.71;
        }else {
            System.out.print("ERRO");
        }

        System.out.printf("O seu peso que é %.2f kg na terre, vira %.2f kg para onde você viajou",
        peso, peso_lugar);
    }
}
