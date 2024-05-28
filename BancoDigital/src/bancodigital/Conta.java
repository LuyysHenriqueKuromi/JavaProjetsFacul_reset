
package bancodigital;

public class Conta {
    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;
    
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transf. OK .Valor:" + valor);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", 
                this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", 
                this.agencia));
        System.out.println(String.format("Numero: %d", 
                this.numero));
        System.out.println(String.format("Saldo: %.2f", 
                this.saldo));
    }

}

