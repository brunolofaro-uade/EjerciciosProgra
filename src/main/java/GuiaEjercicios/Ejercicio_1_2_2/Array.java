package Ejercicio122;
import java.util.Arrays;

public class Array {
    private int[] elements;

    public Array() {
        this.elements = new int[]{2, 4, 8, 9, 3};
    }

    public int[] getElements() {
        return this.elements;
    }

    public int[] getSubarray(int lowerLimit, int upperLimit) {
        return Arrays.copyOfRange(this.elements, lowerLimit, upperLimit);
    }
}
