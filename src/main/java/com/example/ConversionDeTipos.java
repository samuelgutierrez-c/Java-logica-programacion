public class ConversionDeTipos {
    public static void mostrarEjemplos() {
        int numero = 10;
        double numeroDouble = (double) numero;
        int numeroEntero = (int) numeroDouble;

        String texto = "123";
        int convertido = Integer.parseInt(texto);

        System.out.println("Número original: " + numero);
        System.out.println("Número convertido a double: " + numeroDouble);
        System.out.println("Número convertido a int: " + numeroEntero);
        System.out.println("Texto convertido a número: " + convertido);
    }
}
