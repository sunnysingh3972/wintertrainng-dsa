import java.util.Arrays;

public class meetingmaximumguests {
  static int meetingmax(int arr[],int dep[])
  {
    int n=arr.length;
    Arrays.sort(arr);
    Arrays.sort(dep);
    int i=1,j=0,curr=1,res=1;
    while(i<n&&j<n)
    {
        if(arr[i]<=dep[j])
        {
            i++;curr++;
        }

        else
        {
            j++;
            curr--;
        }
        res=Math.max(res, curr);
    }
    return res;
  }  
  public static void main(String[] args) {
    int arr[]={900,600,700};
    int dep[]={1000,800,730};
    System.out.println("Maximum guest which you can meet : "+meetingmax(arr, dep));
  }
}
