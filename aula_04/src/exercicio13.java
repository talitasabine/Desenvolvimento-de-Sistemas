import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("\nDigite a distância em km: ");
    double km2 = sc.nextDouble();
    double milhas2 = km2 / 1.61;
    System.out.println("Distância em milhas: " + milhas2);

    sc.close();
    }
}