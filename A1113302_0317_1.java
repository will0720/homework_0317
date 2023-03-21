import java.util.*;

public class A1113302_0317_1 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入n的值:");
        int n = sc.nextInt();
        
        System.out.print("請輸入m的值:");
        int m = sc.nextInt();
        
        int [][] array = new int [n][m];
        
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
    
        for (int [] a : array) {
            for (int b : a) {
                System.out.print(b + "\t");
            }
            System.out.println("");
        }
    }
}


