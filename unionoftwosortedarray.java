public class unionoftwosortedarray {
    static void printunion(int a[],int b[])
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
            if(j>0&&b[j]==b[j-1])
            {
                j++;
                continue;
            }
            if(a[i]<b[j])
            {
                System.out.print(a[i]+" ");
                i++;
            }
            else if(a[i]>b[j])
            {
                System.out.print(b[j]+" ");
                j++;
            }
            else
            {
                System.out.print(a[i]+" ");
                i++;j++;
            }
        }
        while(i<m){
        if(i>0&&a[i]!=a[i-1])
       System.out.print(a[i]+" ");
        i++;}
        while(j<n)
        {
            if(j>0&&b[j]!=b[j-1])
            System.out.print(b[j]+" ");
            j++;
        }

    }
    public static void main(String[] args) {
        int a[]={1,3,4,5,6,6,6};
        int b[]={2,5,6,6,6,7};
        printunion(a, b);
    }
}
