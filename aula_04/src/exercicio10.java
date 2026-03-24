import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a velocidade em km/h: ");
    double kmh = sc.nextDouble();
    double ms = kmh / 3.6;
    System.out.println("Velocidade em m/s: " + ms);

    sc.close();
    }
}