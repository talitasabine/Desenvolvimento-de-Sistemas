import java.util.Scanner;

public class exercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Número 3 dígitos: ");
        int n = sc.nextInt();
        int inv = (n%10)*100 + ((n/10)%10)*10 + (n/100);
        System.out.println("Invertido: " + inv);
        
        sc.close();
    }
}