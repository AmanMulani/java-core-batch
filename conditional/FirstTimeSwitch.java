package conditional;

/**
 * Switch statement:
 * On the basis of the value of a variable, execute some code.
 * 
 * Problem Statement:
 * Take a number from user, and perform the following on the basis of that number:
 * If input is 1, print "Hello World";
 * If input is 2, print "This is valid"
 * If input is 3, print "Can I get some water?"
 * If input is 4, print "Hello"
 * 
 * And if any other input is provided, then print, "Hey, this is not a valid input, can you try again?"
 */

public class FirstTimeSwitch {
    
    public static void main(String[] args) {
        int input = 1;

        switch(input) {
            case 1: {
                System.out.println("Hello World");
                break;
            }

            case 2: {
                System.out.println("This is valid");
                break;
            }

            case 3: {
                System.out.println("Can I get some water?");
                break;
            }

            case 4: {
                System.out.println("Hello");
                break;
            }

            default: {
                System.out.println("Hey, this is not a valid input, can you try again?");
            }
        }
    }
}
