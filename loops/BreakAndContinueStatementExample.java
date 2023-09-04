package loops;

public class BreakAndContinueStatementExample {
    
     public static void main(String[] args) {

        System.out.println("This is for BREAK");
        for(int i = 0; i<10; i++) {
            System.out.println(i);
            if(i == 5) {
                break;
            }
            System.out.println("I am still inside loop");
        }

        System.out.println("This is for CONTINUE");
        for(int i = 0; i<10; i++) {
            System.out.println(i);
            if(i == 5) {
                continue;
            }
            System.out.println("I am still inside loop");
        }
        
     }
}
