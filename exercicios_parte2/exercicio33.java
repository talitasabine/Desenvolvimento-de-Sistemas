import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Lado do quadrado: ");
        double lado = sc.nextDouble();
        System.out.println("Área: " + (lado*lado));
        
        sc.close();
    }
}
