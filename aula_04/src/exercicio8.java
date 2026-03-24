import java.util.Scanner;
public class exercicio8{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Kelvin: ");
        double kelvin = sc.nextDouble();
        double celsius = kelvin - 273.15;
        System.out.println("Temperatura em Celsius: " + celsius);

        sc.close();
    }
}
