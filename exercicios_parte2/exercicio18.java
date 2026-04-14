import java.util.Scanner;
public class exercicio18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("\n Metros cúbicos: ");
        double m3 = sc.nextDouble();
        double litros = 1000 * m3;
        System.out.println("Litros: " + litros);
    sc.close();
    }
}