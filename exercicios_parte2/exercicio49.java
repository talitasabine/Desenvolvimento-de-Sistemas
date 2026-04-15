import java.util.Scanner;

public class exercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hora inicial (h m s): ");
        int hi = sc.nextInt(), mi = sc.nextInt(), si = sc.nextInt();
        System.out.print("Duração em segundos: ");
        int dur = sc.nextInt();
        int totalSeg = hi*3600 + mi*60 + si + dur;
        int hf = (totalSeg/3600)%24;
        int mf = (totalSeg%3600)/60;
        int sf = totalSeg%60;
        System.out.println("Hora final: "+hf+":"+mf+":"+sf);
        
        sc.close();
    }
}