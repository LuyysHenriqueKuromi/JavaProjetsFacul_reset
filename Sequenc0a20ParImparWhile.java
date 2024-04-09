public class Sequenc0a20ParImparWhile {
    public static void main(String[] args) {
        int repet = 0;
        while (repet <= 20) {
            if (repet % 2 == 0) {
                System.out.printf("%d é um número PAR\n",
                repet);
            }else {
                System.out.printf("%d é um número ÍMPAR\n",
                repet);
            }
            repet++;
        }
    }
}