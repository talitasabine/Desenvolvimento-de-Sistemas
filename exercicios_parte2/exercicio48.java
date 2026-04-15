import java.util.Scanner;

public class exercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Segundos: ");
        int seg = sc.nextInt();
        int horas = seg/3600;
        int minutos = (seg%3600)/60;
        int segundos = seg%60;
        System.out.println(horas+"h "+minutos+"m "+segundos+"s");
        
        sc.close();
    }
}