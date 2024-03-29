# firstproject
public class binarySearch{
    public static void binarySearch(int[] arr, int first , int last, int key){
        int mid = (first + last)/2;

        while( first <= last) {

            if (arr[mid] < key) {
                first = mid + 1;
            }

            else if (arr[mid] == key) {
                System.out.println("Element is found at index " + (mid+1));
                break;
            }

            else {
                last = mid - 1;
            }

            mid = (first + last)/2;
        }

        if (first > last) {
            System.out.println("Element is not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int key = 50;
        int first = 0;
        int last = arr.length - 1;

        // calling the function
        binarySearch(arr,first,last,key);
    }
}
