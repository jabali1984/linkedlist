package ejercicioArrayCopia;
import java.util.Arrays;
import java.util.Scanner;

public class CopiarArrays {

    public static void main(String[] args) {
        // Declaramos el arrayorig.
        int[] arrayOrig = {3, 10, 5, 7, 14, 20, 83};

        // Pide al usuario la posición inicial y final.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la posición inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Introduce la posición final: ");
        int fin = sc.nextInt();

        // Sirve para validar las posiciones.
        if (inicio < 0 || fin >= arrayOrig.length || inicio > fin) {
            System.out.println("Posiciones inválidas.");
            sc.close();
            return;
        }

        // Copia los elementos en otro array.
        int[] arrayCopia = Arrays.copyOfRange(arrayOrig, inicio, fin + 1);

        // Visualiza el resultado.
        System.out.println("Array copiado: " + Arrays.toString(arrayCopia));

        // Hace una copia exacta del primer array en un tercer array.
        int[] arrayCopiaExacta = Arrays.copyOf(arrayOrig, arrayOrig.length);

        // Visualiza el resultado de comparar los arrays.
        System.out.println("Comparación entre el primer y segundo array: " + Arrays.equals(arrayOrig, arrayCopia));
        System.out.println("Comparación entre el primer y tercer array: " + Arrays.equals(arrayOrig, arrayCopiaExacta));

        // Pide un número al usuario y rellenar todos los elementos del tercer array con ese número.
        System.out.print("Introduce un número para rellenar el tercer array: ");
        int numeroUsuario = sc.nextInt();
        Arrays.fill(arrayCopiaExacta, numeroUsuario);

        // Visualiza el resultado del tercer array.
        System.out.println("Tercer array después de rellenar: " + Arrays.toString(arrayCopiaExacta));

        sc.close();
    }
}