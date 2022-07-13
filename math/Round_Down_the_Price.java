//https://codeforces.com/contest/1702/problem/A
import java.util.Scanner;

public class Round_Down_the_Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        while (n-->0) { //(n-->0) <-> for (int i = 0; i < n; i++)
            String numStr = sc.next(); //get num as String to get length
            int len = numStr.length() - 1; //the length
            long numInt = Integer.parseInt(numStr); //convert to int for Caculate

            System.out.println(numInt - ((long)Math.pow(10, len))); //the final math formula
        }
    }
}
