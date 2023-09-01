package loops;

/**
 * Print the following pattern:
 * #
 * ##
 * ###
 * ####
 * ##### (5)
 * 
 * Also print the following:
 * #####
 * ####
 * ###
 * ##
 * #
 */
public class ForLoopExample {

    public static void main(String[] args) {
        // initialization, condition, update expression

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        for(int i = 5; i>=1; i--) {
            for(int j = 1; j<=i; j++) {
                System.out.print("#");
            }
            System.out.println();   
        }

    }
}
