import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/max-rectangle/1

public class maxrectangleinbinaryarray {
    public static int[]  prevSmallerelement(int[] arr,int n)
  {
      Stack<Integer> s=new Stack<>();
      int a[]=new int[n];
      s.push(-1);
      for(int i=0;i<n;i++)
      {
          while(s.peek()!=-1&&arr[s.peek()]>=arr[i])
          {
              s.pop();
          }
          a[i]=s.peek();
          s.push(i);
      }
      return a; 
      
  }
    public static int[] nextSmallerelement(int[] arr,int n)
    {
       Stack<Integer> s=new Stack<>();
      int a[]=new int[n];
      s.push(-1);
      for(int i=n-1;i>=0;i--)
      {
          while(s.peek()!=-1&&arr[s.peek()]>=arr[i])
          {
              s.pop();
          }
          a[i]=s.peek();
          s.push(i);
      }
      return a;
    }
    public static int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int next[]=new int[n];
        next=nextSmallerelement(arr,n);
        int prev[]=new int[n];
        prev=prevSmallerelement(arr,n);
        int l,b,area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {  
            l=arr[i];
            if(next[i]==-1)
              next[i]=n;
            b=next[i]-prev[i]-1;
            int ar=l*b;
            area=Math.max(area,ar);
            
        }
        return area;
        
        
    }
    public static int maxArea(int m[][], int n, int m1) {
       int area=largestRectangleArea(m[0]);
       for(int i=1;i<n;i++)
       {
           for(int j=0;j<m1;j++)
           {
               if(m[i][j]!=0)
               m[i][j]+=m[i-1][j];
               else
               m[i][j]=0;
           }
           area=Math.max(area,largestRectangleArea(m[i]));
       }
       return area;
    }
    public static void main(String[] args) {
        int arr[][]={{0 ,1 ,1, 0},
        {1 ,1 ,1 ,1},
        {1 ,1, 1, 1},
        {1 ,1 ,0 ,0}};
        System.out.println(maxArea(arr,4,4));
    }
    
}
