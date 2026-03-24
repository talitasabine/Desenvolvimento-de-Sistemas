public class ForEach {
    public static void main(String[] args) {
        // FOR EACH = para percorrer arrays/coleções
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int num: numeros){
            if (num % 2 == 0){
                System.out.println("Par (for-each): " +num);
            }
        }
    }
}
