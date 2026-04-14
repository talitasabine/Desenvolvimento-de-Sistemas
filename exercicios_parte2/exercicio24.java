import java.util.Scanner;
public class exercicio24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("\nMetros quadrados: ");
        double mQuad = sc.nextDouble();
        double acres = mQuad * 0.000247;
        System.out.println("Acres: " + acres);

    sc.close();
    }

}
