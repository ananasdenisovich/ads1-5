import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Fib(n));
    }
    public static int Fib(int n){
        int x = 0;
        if (n>2){
            x = Fib(n-1) + Fib(n-2);
        } else {
            x = 1;
        }
        return x;
    }
}