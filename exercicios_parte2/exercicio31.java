import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número inteiro: ");
        int num = sc.nextInt();
        System.out.println("Antecessor: " + (num-1));
        System.out.println("Sucessor: " + (num+1));
        sc.close();
    }

}
