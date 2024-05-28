
package bancodigital;

public class ContaPoupanca extends Conta {
    
    private static final double LIMITE_SAQUE = 500;
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    
    public void sacar(double valor) {
        if (valor <= LIMITE_SAQUE) {
            super.sacar(valor);
            System.out.print("Valor sacado:" );
        }else {
            System.out.println("Limite de saque excedido."
                    + "o limite máximo é de " + LIMITE_SAQUE);
        } 
    }
    
    public void imprimirExtrato() {
        System.out.println("=== Conta Poupanca ===");
        super.imprimirInfosComuns();
    }
    
}
