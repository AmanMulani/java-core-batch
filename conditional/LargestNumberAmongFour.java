package conditional;

public class LargestNumberAmongFour {
    
    public static void main(String[] args) {
        int a = 10, b = 11, c = 9, d = 100;

        if(a > b && a > c && a > d) {
            System.out.println("a is the biggest number");
        } else if (b>c && b>d) {
            System.out.println("b is the biggest number");
        } else if (c>d) {
            System.out.println("c is the biggest number");
        } else {
            System.out.println("d is the biggest number");
        }
    }
}
