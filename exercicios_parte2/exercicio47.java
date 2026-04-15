import java.util.Scanner;

public class exercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Número 4 dígitos: ");
        int n4d = sc.nextInt();
        System.out.println(n4d/1000);
        System.out.println((n4d/100)%10);
        System.out.println((n4d/10)%10);
        System.out.println(n4d%10);
        
        sc.close();
    }
}