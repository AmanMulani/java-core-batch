package src.loops;

public class OddEvenPattern {
    
    /* 
     * 
     * 
        O/P:
        @#@#@#
        @#@#@#
        @#@#@#
        @#@#@#
        @#@#@#    
    */
    public static void main(String[] args) {
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<6; j++) {
                if(j%2 == 0) {
                    System.out.print("@");
                } else {
                    System.out.print("#");
                }
                
            }
            System.out.println();
        }
    }
}
