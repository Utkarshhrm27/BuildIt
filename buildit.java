import java.util.concurrent.ForkJoinPool;

public class buildit {
    public static void main(String[] args) {

        // BRUTE FORCE
        // int temp;
        // for (int i = 0; i < arr.length ; i++) {
        // for(int j=i+1;j<arr.length;j++){
        // if (arr[i] > arr[j]) {
        // temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }

        // System.out.println(arr[arr.length-1]);

        // OPTIMAL
        int[] arr = { 3, 2, 1, 5, 2 };
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else {
            }
        }
        System.out.println(largest);

    }

}
