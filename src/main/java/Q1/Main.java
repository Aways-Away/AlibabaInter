package Q1;

import java.util.Scanner;

/**
 * Created by LiuCui on 2021/3/12 15:27
 */

/**
 * 输入n，对于n行3列的矩阵，每个位置放入数字1、2、3中的任意一个，但要保证每个位置的数字与其上下左右不能相同，
 * 数字选取字数无限制，输出一共能有多少种排列的可能性。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int num = scanner.nextInt();
            long n = 6;
            long m = 6;
            for(int i=0;i<num-1;i++){
                long newn = (n*2) % 1000000007 + (m*2)%1000000007;
                long newm = (n*2) % 1000000007 + (m*2)%1000000007;
                n =  newn % 1000000007;
                m = newm % 1000000007;
            }
            System.out.println((n+m) % 1000000007);
        }
    }
}
