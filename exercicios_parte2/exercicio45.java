import java.util.Scanner;

public class exercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Letra maiúscula: ");
        char letra = sc.next().charAt(0);
        char minuscula = (char)(letra + 32);
        System.out.println("Minúscula: " + minuscula);
        
        sc.close();
    }
}