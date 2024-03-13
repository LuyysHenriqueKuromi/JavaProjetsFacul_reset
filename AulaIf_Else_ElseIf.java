public class AulaIf_Else_ElseIf {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        if (x > y) { // false
            System.out.println("X é maior que Y");
        }else if (y > x) { //false
            System.out.println("Y é maior que X");
        }else { // cair aqui
            System.out.println("X e Y são iguais");
        }
    }
}
