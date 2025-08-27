public class TiposDeDatos {

    public static void main(String[] args) {
        System.out.println("---- Tipos de Datos Primitivos ----");
        // Tipos enteros
        byte unByte = 127;
        short unShort = 32767;
        int unInt = 2147483647;
        long unLong = 9223372036854775807L;

        // Tipos de punto flotante
        float unFloat = 3.14f;
        double unDouble = 3.14159265359;

        // Tipo booleano y carácter
        boolean esVerdadero = true;
        char unCaracter = 'J';

        System.out.println("Byte: " + unByte);
        System.out.println("Short: " + unShort);
        System.out.println("Int: " + unInt);
        System.out.println("Long: " + unLong);
        System.out.println("Float: " + unFloat);
        System.out.println("Double: " + unDouble);
        System.out.println("Boolean: " + esVerdadero);
        System.out.println("Char: " + unCaracter);

        System.out.println("\n---- Tipos de Datos de Referencia ----");
        // String es el tipo de referencia más común
        String unString = "Hola, Java!";
        System.out.println("String: " + unString);
    }
}