import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio do círculo: ");
        double r = sc.nextDouble();
        double areaC = 3.141592 * r * r;
        System.out.println("Área: " + areaC);

        sc.close();
    }
}
