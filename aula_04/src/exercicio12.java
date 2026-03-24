import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nDigite a distância em milhas: ");
    double milhas = sc.nextDouble();
    double km = 1.61 * milhas;
    System.out.println("Distância em km: " + km);

    sc.close();
    }
}