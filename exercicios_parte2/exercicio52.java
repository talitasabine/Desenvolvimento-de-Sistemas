import java.util.Scanner;

public class exercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valores apostados (3): ");
        double v1 = sc.nextDouble(), v2 = sc.nextDouble(), v3 = sc.nextDouble();
        double soma = v1+v2+v3;
        double premio = 1000; // exemplo
        System.out.println("1: " + (premio*(v1/soma)));
        System.out.println("2: " + (premio*(v2/soma)));
        System.out.println("3: " + (premio*(v3/soma)));
        
        sc.close();
    }
}