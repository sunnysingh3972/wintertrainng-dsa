import java.util.Arrays;

public class sortanarraywiththreetypesofelements {
    static void Sort(int arr[]) {
        int l = 0, h = arr.length - 1, mid = 0;
        int temp;
        while (mid <= h) {
            if (arr[mid] == 0) {
                temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = temp;
                l++;
                mid++;
            }
            else if(arr[mid]==1)
            mid++;
            else
            {
                temp=arr[mid];
                arr[mid]=arr[h];
                arr[h]=temp;
                h--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={0,2,1,2,1,0,1,2};
        Sort(arr);
    }
}
