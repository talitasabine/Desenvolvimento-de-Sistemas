import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Centímetros: ");
        double c = sc.nextDouble();
        double p = c / 2.54;
        System.out.println("Polegadas: " + p);

    sc.close();
    }
}