import java.util.Scanner;
import java.util.Arrays;

public class Secondmethod_evenstable {

    public void sortEvenNumbers(int[] arr) {
        int[] evens = Arrays.stream(arr).filter(x -> x % 2 == 0).sorted().toArray();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = evens[j++];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Secondmethod_evenstable obj = new Secondmethod_evenstable();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        obj.sortEvenNumbers(arr);

        System.out.println("Array after sorting even numbers only:");
        System.out.println(Arrays.toString(arr));
    }
}
