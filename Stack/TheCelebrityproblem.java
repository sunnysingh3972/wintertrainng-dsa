import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1


public class TheCelebrityproblem {
   public static int celebrity(int m[][], int n)
    {
    Stack<Integer> s=new Stack<>();
    for(int i=0;i<n;i++)
    {
        s.push(i);
    }
    while(s.size()>1)
    {
        int a=s.peek();
        s.pop();
        int b=s.peek();
        s.pop();
        if(m[a][b]==1)
        s.push(b);
        else
        s.push(a);
    }
    boolean rowCheck=false;
    int zerocount=0;
    int ans=s.peek();
    for(int i=0;i<n;i++)
    {
        if(m[ans][i]==0)
        zerocount++;
    }
    if(zerocount==n)
    rowCheck=true;
    boolean colCheck=false;
    zerocount=0;
    for(int i=0;i<n;i++)
    {
        if(m[i][ans]==1)
        zerocount++;
    }
    if(zerocount==n-1)
    colCheck=true;
    if(rowCheck==true&&colCheck==true)
    return ans;
    else
    return -1;
    
    }
    public static void main(String[] args) {
        int arr[][]={{0 ,1, 0},{0, 0 ,0}, {0 ,1, 0}};
        int n=3;
        System.out.println(celebrity(arr, n));
    }
}
