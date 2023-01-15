import java.util.TreeSet;

public class ceilingonleftside {
    static void printceiling(int arr[],int n)
    {
        TreeSet<Integer> t=new TreeSet<>();
       
        for(int i=0;i<n;i++)
        {
            Integer s=t.ceiling(arr[i]);
            if(s==null)
            System.out.print("-1 ");
            else
            System.out.print(s+" ");

            t.add(arr[i]);
        }
    }
   public static void main(String[] args) {
    int arr[]={2,8,30,15,25,12};
    int n=arr.length;
    printceiling(arr,n);
   } 
}
