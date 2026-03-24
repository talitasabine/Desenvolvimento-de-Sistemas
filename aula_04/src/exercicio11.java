import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nDigite a velocidade em m/s: ");
    double ms2 = sc.nextDouble();
    double kmh2 = ms2 * 3.6;
    System.out.println("Velocidade em km/h: " + kmh2);

    sc.close();
    }
}