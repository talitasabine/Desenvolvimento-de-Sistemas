public class While {
    public static void main(String[] args)  {
       
        // WHILE -quando não se sabe quantas repetições

        int vezes = 0;

        while (vezes <= 10) {
            if (vezes % 2 == 0) {
                System.out.println("Par while: " + vezes);
                
            }
            vezes++;          
        }
    }
}
