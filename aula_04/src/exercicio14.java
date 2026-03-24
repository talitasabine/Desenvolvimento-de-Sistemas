import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("\nDigite o ângulo em graus: ");
    double graus = sc.nextDouble();
    double rad = graus * 3.14 / 180;
    System.out.println("Ângulo em radianos: " + rad);

    sc.close();
    }
}