import java.util.Arrays;

public class insertionsort {
    static void insertionsortt(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.print(Arrays.toString(arr)+" ");
    }
    public static void main(String[] args) {
        int arr[]={5,3,6,2,1,4};
        insertionsortt(arr);
        
    }
}
