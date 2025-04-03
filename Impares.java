import java.util.Scanner;
public class Impares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= num);
    }
}
