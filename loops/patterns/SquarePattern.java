package loops.patterns;


/**
 * Print this pattern:
 * For int n = 5, m = 6:
 * ######
 * ######
 * ######
 * ######
 * ######
 */
public class SquarePattern {
    public static void main(String[] args) {
        int n = 5, m = 10;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                System.out.print("#");    
            }
            System.out.println();
        }
    }
}
