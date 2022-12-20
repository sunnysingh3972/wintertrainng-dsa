import java.util.Arrays;

public class sortanarraywithtwotypesofelement {
    static void sortwithneg(int arr[]) {
        int i = -1, j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] < 0);
            do {
                j--;
            } while (arr[j] >= 0);
            if (i >= j)
                return;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }

    public static void main(String[] args) {
        int arr[] = { -1, 3, 9, -2, -3, 7, -9, 7 };
        sortwithneg(arr);
        System.out.println(Arrays.toString(arr));

    }
}
