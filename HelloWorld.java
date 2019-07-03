import java.io.*;
import java.util.*;
public class HelloWorld
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        int m=0,n=1;
        ArrayList<String> al=new ArrayList<String>(); 
        for(int i=0;i<str.length();i++)
        {
            int  count=0;
            str1=str.substring(m,n);
            String str2="";
            for(int j=0;i<str1.length();i++)
            {
                str2=str2+str1.charAt(j);
                for(int k=j+1;k<str1.length();k++)
                {
                    if(str1.charAt(j)!=str1.charAt(k))
                        count++;
                    else
                    {
                        count=1;
                        m=k;
                        break;
                    }
                }
                if(count==str1.length()-1)
                {
                    n++;
                    break;
                }
                else
                {
                    n=m+1;
                    break;
                }
                    
            }
            al.add(str2);
        }
        Collections.sort(al);
        String  s=al.get(0);
        System.out.print(s.length());
     }
}
