# firstproject


import java.util.Scanner;
class t {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the element in the array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("your exesting array is");
        for (int i=0; i<n; i++) {
            System.out.println(array[i]);
        }

        int loc = 0;
        int flag = 0;
        int delete = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (delete == array[i]) {
                loc = i;
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            for (int i = loc + 1; i < n; i++) {
                array[i - 1] = array[i];
            }
            n--;
        }else if (flag==0){
            System.out.println("number not found");
        }

        if (flag==1){

            System.out.println("array after deletion");
            for (int i=0;i<n;i++){
                System.out.println(array[i]);
            }
        }
        else {
            System.out.println("please enter a valid number");
        }


    }
}





