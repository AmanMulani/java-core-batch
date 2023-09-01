package loops.patterns;

/**
 * Here is the even odd pattern:
 * 
 * for n = 5, m = 6
 * @#@#@#
 * @#@#@#
 * @#@#@#
 * @#@#@#
 * @#@#@#
 */

public class EvenOddStarHashPatter {
    public static void main(String[] args) {
        int n = 5, m = 6;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
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
