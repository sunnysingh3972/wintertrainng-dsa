import java.util.Scanner;
import java.util.Stack;

public class reverseastringusingstack {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            s.push(str.charAt(i));
        }
        String res="";
        for(int i=0;i<str.length();i++)
        {
            res+=s.pop();
        }
    System.out.println(res);
    }
}
