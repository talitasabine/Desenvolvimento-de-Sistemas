import java.util.Scanner;
public class exercicio19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Litros: ");
        double l = sc.nextDouble();
        double m = l / 1000;
        System.out.println("Metros cúbicos: " + m);
    sc.close();
    }

}
