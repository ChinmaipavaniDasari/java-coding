import java.util.Scanner;
class Subtracting_without_minus{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int ans = (a +(~b+1));
        System.out.println("Ans:"+ans);
    }
}