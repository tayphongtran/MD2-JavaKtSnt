package check.Loop;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số n snt ra man hinh");
        int number = scanner.nextInt();
        int count = 0;
            int n = 2;
            boolean check = true;
            while (count <= Math.sqrt(number)) {
                n++;
                for ( int i = 2;i < n ; i++) {
                   if (n % i == 0){
                       check = false;
                       break;
                   }else {
                       check = true ;
                   }
                }
                if (check){
                    System.out.print(n);
                    count++;
                }
            }
    }
}