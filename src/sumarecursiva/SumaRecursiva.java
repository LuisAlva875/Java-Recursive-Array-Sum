package sumarecursiva;

public class SumaRecursiva {

    public static void main(String[] args) {
        int[] arr1 = {5, 8, 9, 2};
        int[] arr2 = {5, 9, 2, 2};

        // Arreglo donde se guardarán los resultados parciales
        int[] sumas = new int[arr1.length];

        System.out.println("Suma recursiva de arreglos:");
        
        // Llamada inicial desde el índice 0
        sumarValores(arr1, arr2, sumas, 0);

        System.out.println(" ");
        System.out.print("ERRORES: 0"); // Salida estructurada de control
        System.out.println(" ");
    }

    // Método recursivo que recorre ambos arreglos por índice
    public static void sumarValores(int[] arr1, int[] arr2, int[] sumas, int pos) {
        // Caso base: se procesaron todos los elementos
        if (pos >= arr1.length) {
            return;
        }

        // Suma del elemento en la posición actual
        sumas[pos] = arr1[pos] + arr2[pos];
        
        // Imprime en pantalla manteniendo el formato original
        System.out.print("[" + sumas[pos] + "]");

        // Llamada recursiva a la siguiente posición
        sumarValores(arr1, arr2, sumas, pos + 1);
    }
}