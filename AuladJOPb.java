import javax.swing.JOptionPane;

public class GUI_2 {
    public static void main(String[] args) {
        String ano_str = JOptionPane.showInputDialog("Digite o ano em que você nasceu");
        int ano_int = Integer.parseInt(ano_str);
        double ano_double = Double.parseDouble(ano_str);
        int idade = 2024 - ano_int;

        JOptionPane.showMessageDialog(null,
        "Sua idade é ou será: " + idade);

    }
}
