package Ejercicio122;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int LOWER_LIMIT = 1;
        final int UPPER_LIMIT = 3;

        Array array = new Array();

        String arrayElements = Arrays.toString(array.getElements());

        String subarrayElements = "";

        try {
            subarrayElements = Arrays.toString(array.getSubarray(LOWER_LIMIT, UPPER_LIMIT));
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException exception) {
            System.out.println("Los límites del subarray solicitado son inválidos: "
                    + exception);
            System.exit(0);
        }

        System.out.println("Elementos del array: " + arrayElements);
        System.out.println("Elementos del subarray solicitado: " + subarrayElements);
    }
}
