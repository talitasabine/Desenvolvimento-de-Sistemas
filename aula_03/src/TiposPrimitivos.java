public class TiposPrimitivos {
    public static void main(String[] args) {

        //int, double, char, float, long, boolean, byte e long

        int age = 24;
        long numeroGrande = 10L;
        float numeroFracionado = 10.5f;
        char inicial = '\u0041'; // (2 bytes) pode ser unicode
        boolean verdadeiro = true;
        boolean falso = false;
        short numeroPequeno = 10;
        byte numeroPequenoByte = 10;
        String nome = "Talirar"; 


        System.out.println("A idade é: " +age+ " anos");
        System.out.println("O número grande é: " +numeroGrande);
        System.out.println("Sua conta deu: " +numeroFracionado+ "reais");
        System.out.println("Inicial: " +inicial);
        System.out.println("Valor verdadeiro: " +verdadeiro);
        System.out.println("Valor falso: " +falso);
        System.out.println("Esse é o número pequeno (short): " +numeroPequeno);
        System.out.println("Número pequeno (byte): " +numeroPequenoByte);
        System.out.println("Meu apelido é: " +nome);
        
    }
    
}
