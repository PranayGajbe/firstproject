# firstproject
import java.util.Scanner;
import java.util.Arrays;

public class deletion {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the position of element to be deleted: ");
        int pos = sc.nextInt();

        int[] newarr = new int[n-1];
        for (int i = 0; i < n-1; i++)
        {
            if (i < (pos - 1))
            {
                newarr[i] = arr[i];
            }
            else if (i == (pos - 1))
            {
                continue;
            }
            else if (i > (pos - 1))
            {
                newarr[i] = arr[i+1];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
