import java.util.Scanner;

public class TiposNaoPrimitivos {
    public static void main(String[] args) {
        //String (classe)
        String nome = "Java";
        //Array (vetor)
        int[] numeros = {1, 2, 3, 4, 5};
        //objeto Scanner
        Scanner scanner = new Scanner(System.in);
        //exibindo valores

        System.out.println("Nome: " +nome);
        System.out.println("Primeiro número do array: " +numeros[0]);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade digitada " +idade);
        scanner.close();
    }
    
}
