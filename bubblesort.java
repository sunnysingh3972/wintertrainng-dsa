import java.util.Arrays;

public class bubblesort {
   static void bubblesort1(int arr[])
   {
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    System.out.print(Arrays.toString(arr));
   }
   static void bubblesorto(int arr[])
   {
    int n=arr.length;
    for(int i=0;i<n;i++)
    {boolean swapped=false;
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
            if(swapped==false)
            break;
        }
    }
    System.out.print(Arrays.toString(arr));
} 
   public static void main(String[] args) {
    int arr[]={3,5,6,2,9};
    bubblesort1(arr);
    bubblesorto(arr);
   }
}
