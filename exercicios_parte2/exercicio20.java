import java.util.Scanner;
public class exercicio20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("\nQuilogramas: ");
        double kg = sc.nextDouble();
        double lb = kg / 0.45;
        System.out.println("Libras: " + lb);

    sc.close();
    }

}
