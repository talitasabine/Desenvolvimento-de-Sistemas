import java.util.Scanner;
public class exercicio23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         System.out.print("\n Metros: ");
        double m2 = sc.nextDouble();
        double jardas = m2 / 0.91;
        System.out.println("Jardas: " + jardas);

    sc.close();
    }

}
