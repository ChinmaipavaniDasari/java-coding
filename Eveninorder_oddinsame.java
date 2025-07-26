import java.util.Scanner;
import java.util.Arrays;
class Eveninorder_oddinsame{
    public static void main(String[] args){
        int evencount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" number");
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
           if(arr[i] %2 ==0){
            evencount++;
           }
        }
        int[] b = new int[evencount];
        int j=0;
        for(int i=0;i<n;i++){
           if(arr[i]%2 == 0){
            b[j] = arr[i];
            j++;
           }
        }
        Arrays.sort(b);
        j = 0;
        System.out.println("result:");
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                arr[i] = b[j];
                j++;
            }
            System.out.printf("%4d",arr[i]);
        }

    }
    
}
// we can do this by using stream,filter,sort,toArray;