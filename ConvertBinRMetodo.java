public class ConvertBinRMetodo {
    public static void main(String[] args) {
        ConverterBitcoin(1);
        
    }

    public static void ConverterBitcoin(double bitcoin) {
        double real =  bitcoin / 313997.37;
        System.out.println("o valor convertido é " + real + " reais");
    }
}
