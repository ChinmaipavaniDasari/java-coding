import java.util.Scanner;
class MinandMax{
    public static void main(String[] args){
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        d = Math.abs(a - b);
        int max = (c+d)/2;
        int min = (c-d)/2;
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
    }
}