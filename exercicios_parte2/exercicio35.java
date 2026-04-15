import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Catetos: ");
        double cat1 = sc.nextDouble(), cat2 = sc.nextDouble();
        double hip = Math.sqrt(cat1*cat1 + cat2*cat2);
        System.out.println("Hipotenusa: " + hip);

        sc.close();
    }
}
