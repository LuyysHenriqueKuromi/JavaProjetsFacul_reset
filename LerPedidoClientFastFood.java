import java.util.Scanner;

public class LerPedidoClientFastFood {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("----- REDE DE FAST FOOD - WENDEL TOSTADO -----\n");
        System.out.print("[1]Big Super Sanduba\n[2]Quase Super Sanduba\n[3]Mirradus Sanduba\n");

        System.out.print("Qual opção gostaria de escolher? ");
        int opcao = s.nextInt();

        String pedido = "nulo";
        String especif_ped = "nulo";
        double prec_ped = 0;

        if (opcao == 1) {
            pedido = "Big Sanduba";
            especif_ped = "2 hanburgueres, queijo, batata frita e refrigerante";
            prec_ped = 5;
        }else if (opcao == 2) {
            pedido = "Quase Super Sanduba";
            especif_ped = "2 hanburgueres, queijo e refrigerante";
            prec_ped = 3;
        }else if (opcao == 3) {
            pedido = "Mirradus Sanduba";
            especif_ped = "1 misto e 1 refrigerante";
            prec_ped = 1.50;
        }else {
            System.out.print("Erro");
        }

        System.out.printf("O seu pedido foi um %s\nCom extamente: %s\nNo valor de R$%2.2f",
        pedido, especif_ped, prec_ped);
    }
}
