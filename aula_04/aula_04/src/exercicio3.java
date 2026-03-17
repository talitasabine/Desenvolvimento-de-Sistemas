import java.util.Scanner;
public class exercicio3 {
    //exercicio 3 - peça ao usuário para digitar três valores inteiros e imprima a soma deles.
    public static void ex03(Scanner sc) {
        System.out.println("Digite três números inteiros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int soma = n1 + n2 + n3;
        System.out.println("A soma dos três números é: " + soma);
    
    }
    
}
