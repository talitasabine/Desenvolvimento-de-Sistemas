import java.util.Scanner;
public class exercicio21 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("\nLibras: ");
        double libra = sc.nextDouble();
        double kg2 = libra * 0.45;
        System.out.println("Quilogramas: " + kg2);
    sc.close();
    }

}
