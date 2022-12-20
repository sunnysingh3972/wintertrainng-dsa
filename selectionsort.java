import java.util.Arrays;

public class selectionsort {
    static void selectsort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_index])
                min_index=j;
                int temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;
            }
            
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={2,6,4,8,1};
        selectsort(arr);
    }
}
