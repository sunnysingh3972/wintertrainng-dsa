public class quicksort {
    // using lomuto partion
    static int lpartition(int arr[], int l, int h) {
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
//using hoare's partition
static int partion(int arr[],int l,int h)
{
    int pivot=arr[l];
    int i=l-1,j=h-1;
while(true)
{
    do{
        i++;

    }while(arr[i]<pivot);
    do{
        j--;

    }while(arr[j]>pivot);
    if(i>=j)
    return j;
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;

}
}
    static void qsort(int arr[], int l, int h) {
        if (l < h) {
            int p = lpartition(arr, l, h);
            qsort(arr, l, p - 1);
            qsort(arr, p + 1, h);
        }

    }
    static void qsort1(int arr[], int l, int h) {
        if (l < h) {
            int p = partion(arr, l, h);
            qsort(arr, l, p);
            qsort(arr, p + 1, h);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 6, 2, 7, 8, 9 };
        //qsort(arr, 0, arr.length - 1);
        qsort1(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        
    }
}
