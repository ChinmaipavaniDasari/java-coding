import java.util.Scanner;
class EvenorOdd_without_ControlStatements{
    public static void main(String[] args){
        int a,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        a = sc.nextInt();
        r = a % 2;
        String arr[] = {"Even","Odd"};
        System.out.println("Number is "+arr[r]);
    }
}