public class ManejoBasicoExcepciones {
    public static void mostrarEjemplos() {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }
    }
}
