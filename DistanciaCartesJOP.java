import javax.swing.JOptionPane;;


public class DistanciaCartesJOP {
    public static void main(String[] args) {
        int a1x_int, a1y_int, b2x_int, b2y_int, valor1, valor2;
        double preresult, result;

        String a1x_str = JOptionPane.showInputDialog("Digite o valor de X no ponto A: ");
        a1x_int = Integer.parseInt(a1x_str);

        String a1y_str = JOptionPane.showInputDialog("Digite o valor de Y no ponto A: ");
        a1y_int = Integer.parseInt(a1y_str);

        String b2x_str = JOptionPane.showInputDialog("Digite o valor de X no ponto B: ");
        b2x_int = Integer.parseInt(b2x_str);

        String b2y_str = JOptionPane.showInputDialog("Digite o valor de Y no ponto B: ");
        b2y_int = Integer.parseInt(b2y_str);

        valor1 =  (b2x_int - a1x_int);

        valor2 = (b2y_int - a1y_int);

        preresult = Math.pow(valor1, 2) + Math.pow(valor2, 2);

        result = Math.sqrt(preresult);

        JOptionPane.showMessageDialog(null,
        "A distância dos pontos A e B, é " + result);
    }
}
