public class intersectionoftwoarray {
    static void intersection(int a[],int b[])
    {
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        while(i<m&&j<n)
        {
            if(i>0&&a[i]==a[i-1])
            {
                i++;
                continue;
            }
            if(a[i]<b[j])
            {
                i++;
            }
            else if(a[i]>b[j])
            {
                j++;
            
            }
            else
            {
                System.out.print(a[i]+" ");
                i++;j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,4,5,5,6,7,7,8};
        int b[]={2,4,5,6,6,6,6,6};
        intersection(a, b);
    }
}
