import java.util.Scanner;
class Multiplying_without_operator{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = (int)(a/((double)1/b));
        System.out.println("Multiplication:"+c);
    }
}