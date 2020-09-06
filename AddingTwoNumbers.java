import java.io.*;
public class AddingTwoNumbers
{
           public static void main(String args[])  throws IOException
           {
                      // Addition directly assigning values
                    int n1=5,n2=3;
                    int sum=n1+n2;
                    System.out.println("sum of two integers is:"+sum);
                      // Accepting values and adding
                    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                    int add;
                    try{   
                        System.out.println("enter n1:");
                        int n4=Integer.parseInt(br.readLine());
                        System.out.println("enter n2:");
                        int n5=Integer.parseInt(br.readLine());
                        add=n4+n5;
                        System.out.println("Sum of two integers is:"+add);
                    }
                    finally{
                        System.out.println("DONE");
           }}
}


