import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("\nDigite o comprimento em polegadas: ");
    double polegadas = sc.nextDouble();
    double cm = polegadas * 2.54;
    System.out.println("Comprimento em cm: " + cm);

    sc.close();
    }
}