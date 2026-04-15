import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Hectares: ");
        double h = sc.nextDouble();
        double m = h * 10000;
        System.out.println("Metros quadrados: " + m);
    }
    
}
