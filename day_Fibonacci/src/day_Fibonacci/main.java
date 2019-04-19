package day_Fibonacci;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("số thứ n của dãy số fibonacci: ");
        System.out.println("Nhap vao 1 so:");
        int x;
        x = scanner.nextInt();
        int tongn = 0;
        for (int i = 0; i < x; i++) {
            tongn = tongn + fibonacci(i);

        }

        System.out.println(tongn);

    }


    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}

