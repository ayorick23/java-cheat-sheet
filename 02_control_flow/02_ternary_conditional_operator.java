public class OperadorTernario {

    public static void main(String[] args) {
        
        // Operador Ternario
        int numero = 11;
        String paridad = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("\nEl número " + numero + " es " + paridad + ".");
    }
}