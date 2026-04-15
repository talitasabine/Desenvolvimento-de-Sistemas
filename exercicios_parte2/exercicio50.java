import java.util.Scanner;

public class exercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Idade e ano atual: ");
        int idade = sc.nextInt(), ano = sc.nextInt();
        System.out.println("Ano nascimento: " + (ano - idade));
        
        sc.close();
    }
}