import java.util.Scanner;
class Addingnumbers_withoutplusoperator{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        int ans = (a*a - b*b)/(a-b);
        System.out.println("Sum:"+ans);
    }
  
}