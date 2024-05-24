package herança;

public class herança {
    public static void main(String[] args) {
        Pes_fis hissamu = new Pes_fis();
        hissamu.setNome("Wilson Shirado");
        hissamu.setCpf("1234567898");

        System.out.println("O cpf de " + hissamu.getNome() +
                    "é: " + hissamu.getCpf());
    }
}
