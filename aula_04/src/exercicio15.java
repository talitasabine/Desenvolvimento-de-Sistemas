import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("\nDigite o ângulo em radianos: ");
    double rad2 = sc.nextDouble();
    double graus2 = rad2 * 180 / 3.14;
    System.out.println("Ângulo em graus: " + graus2);

    sc.close();
    }
}