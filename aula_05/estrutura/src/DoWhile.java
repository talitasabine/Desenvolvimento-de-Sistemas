public class DoWhile {
    public static void main(String[] args) {
        //  DO WHILE = quando precisa executar ao menos uma vez
        int vezes2 = 0;

        do{
            if (vezes2 % 2 == 0){
                System.out.println("Par (do while): " +vezes2);
            }
            vezes2++;
        } while (vezes2 <= 10);
    }
    
}
