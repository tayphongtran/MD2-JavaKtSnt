package check.Loop;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Boolean flag = true;
        if (number < 2) {
            System.out.println(number + " khong phai snt");
        } else if (number == 2) {
            System.out.println(number + "  la so nt");
        } else if (number % 2 == 0) {
            flag = false;
        } else {
            // lap tu 3 toi number -1 voi buoc nhay i +=2
            for (int i = 3; i < Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true) {
            System.out.println(number + " la snt");
        } else {
            System.out.println(number + " khong phai snt ");
        }
    }
}
