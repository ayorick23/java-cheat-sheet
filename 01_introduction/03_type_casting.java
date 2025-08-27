public class ConversionDeTipos {

    public static void main(String[] args) {
        System.out.println("---- Conversión Implícita (Widening Casting) ----");
        // De un tipo más pequeño a uno más grande, no hay pérdida de datos.
        int numeroInt = 100;
        double numeroDouble = numeroInt; // Conversión automática de int a double

        System.out.println("Valor int: " + numeroInt);
        System.out.println("Valor double (conversión implícita): " + numeroDouble);

        System.out.println("\n---- Conversión Explícita (Narrowing Casting) ----");
        // De un tipo más grande a uno más pequeño, se requiere un casting manual y puede haber pérdida de datos.
        double otroDouble = 100.99;
        int otroInt = (int) otroDouble; // Conversión manual de double a int

        System.out.println("Valor double: " + otroDouble);
        System.out.println("Valor int (conversión explícita): " + otroInt);
    }
}