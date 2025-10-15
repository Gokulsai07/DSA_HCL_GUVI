public class StarBoxPattern {
    public static void main(String[] args) {
        int size = 3; 

        for (int i = 0; i < size; i++) {           
            for (int j = 0; j < size; j++) {       
                if (i == 1 && j == 1) {
                    System.out.print("  ");        
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(); 
        }
    }
}