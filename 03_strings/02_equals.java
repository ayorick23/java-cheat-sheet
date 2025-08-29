public class Equals {

    public static void main(String[] args) {
        System.out.println("---- Comparación de Cadenas ----");
        
        String str1 = "Hola";
        String str2 = "Hola";
        String str3 = new String("Hola");

        // Comparación con ==
        System.out.println("str1 == str2: " + (str1 == str2)); // true, mismas referencias
        System.out.println("str1 == str3: " + (str1 == str3)); // false, diferentes referencias

        // Comparación con equals()
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, mismo contenido
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true, mismo contenido

        // Comparación con equalsIgnoreCase()
        String str4 = "hola";
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true, ignora mayúsculas/minúsculas
    }
}