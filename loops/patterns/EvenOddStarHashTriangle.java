package loops.patterns;

/**
 * Here is the even odd pattern:
 * 
 * for n = 5
 * @
 * @#
 * @#@
 * @#@#
 * @#@#@
 */

public class EvenOddStarHashTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<=i; j++) {
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