import java.util.Scanner;
public class exercicio22 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("\nJardas: ");
        double j = sc.nextDouble();
        double metros = 0.91 * j;
        System.out.println("Metros: " + metros);
    sc.close();
    }

}
