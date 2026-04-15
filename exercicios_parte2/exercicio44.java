import java.util.Scanner;

public class exercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Altura desejada e altura degrau: ");
        double altura = sc.nextDouble(), degrau = sc.nextDouble();
        int qtd = (int)(altura / degrau);
        System.out.println("Degraus: " + qtd);
        
        sc.close();
    }
}

