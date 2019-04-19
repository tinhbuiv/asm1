package test;

import java.util.Scanner;

public class main {
    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so:");
        int x;
        x = scanner.nextInt();

        for (int i = 0; i < x ; i++) {
            if (checkNumber(i)) {
                System.out.print(i + " ");
            }

        }

    }
    public static boolean checkNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
