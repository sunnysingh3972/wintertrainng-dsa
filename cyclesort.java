import java.util.Arrays;

public class cyclesort {
   static void cyclesort(int arr[])
   {
    int n=arr.length;
    int writes=0;
    for(int cs=0;cs<n-1;cs++)
    {
        int item=arr[cs];
        int pos=cs;
        for(int i=cs+1;i<n;i++)
        if(arr[i]<item)
        pos++;
        if(pos==cs)
        continue;
        while(item==arr[pos])
        pos+=1;
        if(pos!=cs)
        {
            int temp=item;
            item=arr[pos];
            arr[pos]=temp;
            writes++;
        }
        while(pos!=cs)
        {
            pos=cs;
            for(int i=cs+1;i<n;i++)
        if(arr[i]<item)
        pos++;
        
        while(item==arr[pos])
        pos+=1;
        if(item!=arr[pos])
        {
            int temp=item;
            item=arr[pos];
            arr[pos]=temp;
            writes++;
        }

        }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("No of swap to sort the array : "+writes);
   } 
   static void cyclesortDistinct(int arr[])
   {
    int n=arr.length;
    int res=0;
    for(int cs=0;cs<n-1;cs++)
    {
        int item=arr[cs];
        int pos=cs;
        for(int i=cs+1;i<n;i++)
        if(arr[i]<item)
        pos++;
        int temp=item;
        item=arr[pos];
        arr[pos]=temp;
      
        while(pos!=cs)
        {
            pos=cs;
            for(int i=cs+1;i<n;i++)
            if(arr[i]<item)
            pos++;
             temp=item;
            item=arr[pos];
            arr[pos]=temp;
          

        }

    }
    System.out.println(Arrays.toString(arr)+" "+res);
   }
public static void main(String[] args) {
    int arr[]={7 ,16 ,14 ,17 ,6, 9 ,5 ,3, 18};
    cyclesort(arr);
    System.out.println();
    cyclesortDistinct(arr);
}

}
