
import java.util.Scanner;

class Demo {
    public static int sumOfTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;
    }

    public static void main(String[] args) {
        int result = sumOfTwoNumbers();
        System.out.println("Sum: " + result);
    }
}
