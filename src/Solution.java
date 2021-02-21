import java.util.Scanner;

public class Solution {

    public static void main(String [] args) {

        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        String operation = console.next();
        int b = console.nextInt();

        if (operation.charAt(0) == '+') {
            System.out.println(a + b);
        }
        else if (operation.charAt(0) == '-')
            System.out.println(a - b);
        else if (operation.charAt(0) == '*')
            System.out.println(a * b);
        else if (operation.charAt(0) == '/') {
            System.out.println(a / b);
        }
    }
}
