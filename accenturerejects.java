import java.util.*;
public class accenturerejects {
    public static int solve(int a , int b , int n){
        int sum =0;
        int count =0;
        while(sum<=n){
            sum+=a+b;
            count++;
            
        }
        return count;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String s[]= input.split("\\s");
        int a = Integer.valueOf(s[0]);
        int b = Integer.valueOf(s[1]);
        int n = Integer.valueOf(s[2]);
        System.out.println(solve(a,b,n));

    }
}
