import java.util.Arrays;

public class minimumdifferencesinanarray {
    static int getmindiff(int arr[])
    {
        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            res=Math.min(res, (arr[i]-arr[i-1]));
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={3,1,5};
        System.out.println(getmindiff(arr));
    }
}

