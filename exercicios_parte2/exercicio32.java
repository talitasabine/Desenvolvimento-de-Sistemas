import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Número inteiro: ");
        int x = sc.nextInt();
        int resultado = (3 * x + 1) + (2 * x - 1);
        System.out.println("Resultado: " + resultado);
        
        sc.close();
    }
}
