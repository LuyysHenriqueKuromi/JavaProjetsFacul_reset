import javax.swing.JOptionPane;

public class ProdutComisVendidoJOP {
    public static void main(String[] args) {
        String nome_func = JOptionPane.showInputDialog("Digite o nome do funcionario: ");
        String produt_vend_str = JOptionPane.showInputDialog("Digite quantos ele vendeu: ");
        int produt_vend_int = Integer.parseInt(produt_vend_str);

        double comi = 0;

        if (produt_vend_int <= 250) {
            comi = 1;
        }else if (produt_vend_int > 250 && produt_vend_int <= 500) {
            comi = 1.50;
        }else if (produt_vend_int > 500) {
            comi = 2;
        }

        double total_comi = produt_vend_int * comi;

        JOptionPane.showMessageDialog(null, "O funcionario " + nome_func +" vai receber R$"
         + total_comi +" de comição, sendo R$" + comi + "por cada");

    }
}
