public class VariablesYAlcance {

    // Variable de Clase (Static)
    // Se inicializa una sola vez y se puede acceder sin crear un objeto.
    static int variableEstatica = 20;

    // Variable de Instancia
    // Pertenece a una instancia de la clase.
    String nombre = "John Doe";

    public static void main(String[] args) {
        // Variable Local
        // Existe solo dentro de este método main.
        int variableLocal = 10;

        System.out.println("---- Alcance de Variables ----");
        
        System.out.println("Variable Local: " + variableLocal);

        System.out.println("Variable Estática (desde la clase): " + VariablesYAlcance.variableEstatica);

        // Para acceder a la variable de instancia, se necesita crear un objeto.
        VariablesYAlcance miObjeto = new VariablesYAlcance();
        System.out.println("Variable de Instancia (desde el objeto): " + miObjeto.nombre);
    }
}