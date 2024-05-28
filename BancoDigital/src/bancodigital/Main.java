
package bancodigital;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Thomas");
        Cliente c2 = new Cliente("Jefferson");

        ContaCorrente cc1 = new ContaCorrente(c1);
        ContaPoupanca pp1 = new ContaPoupanca(c2);

        cc1.imprimirExtrato();
        pp1.imprimirExtrato();

        cc1.depositar(1000.00);
        cc1.imprimirExtrato();

        cc1.transferir(400, pp1);

        cc1.imprimirExtrato();
        pp1.imprimirExtrato();
    }

}
