public class kthsmallestelement {
    static int partiyion(int arr[],int l,int h)
{
    int pivot = arr[h];
        int i = l - 1;
        int temp;
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;

}
static int kthsmallest(int arr[],int k)
{
    int l=0,r=arr.length-1;
    while(l<=r)
    {
        int p=partiyion(arr, l, r);
        if(p==k-1)
        {
            return arr[p];
        }
        else if(p>k-1)
        {
            r=p-1;
        }
        else
        {
            l=p+1;
        }

    }
    return -1;
}
public static void main(String[] args) {
    int arr[]={2,4,6,5,3,8};
System.out.println(kthsmallest(arr, 2));
}
}
