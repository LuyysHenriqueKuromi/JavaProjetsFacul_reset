public class AuladMetodos {
    public static void main(String[] args) {
        imprimir();
        String texto2 = "Metodo com parametros 2";
        imprimirTexto("Metodo com parametros");
        imprimirTexto(texto2);
        somar(10, 21);
        mostrarQuadrado(10);
        mostrarMaior(5, 20, 11);
        mostrarGeneroPorExtenso("F");
        mostrarGeneroPorExtenso("M");
        mostrarGeneroPorExtenso("a");

    }
    
    public static void imprimir() {
        System.out.println("Método Imprimir");
        
    }

    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }

    public static void somar(int a, int b) {
        System.out.println(a + b);
    }

    public static void mostrarQuadrado(int valor) {
        System.out.println(Math.pow(valor, 2));
    }

    public static void mostrarMaior(int a, int b, int c) {
        int maior = Math.max(c, Math.max(a, b));
        System.out.println("o maior eh: " + maior);
    }

    public static void mostrarGeneroPorExtenso(String sexo) {
        if (sexo == "F") {
            System.out.println("Feminino");
        }else if (sexo == "M") {
            System.out.println("Masculino");
        }else {
            System.out.println("outros");
        }
    }


}
