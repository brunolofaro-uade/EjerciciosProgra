public class Ejercicio111 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");

        a = a - b;
        b = b + a;
        a = (-1) * (a - b);

        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.print("b = " + b);
    }
}
