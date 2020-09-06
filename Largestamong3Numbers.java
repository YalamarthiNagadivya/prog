import java.io.*;
public class Largestamong3Numbers{
           public static void main(String args[]){
                      int a = Integer.parseInt(args[0]);
                      int b = Integer.parseInt(args[1]);
                      int c = Integer.parseInt(args[2]);
                      //Write your logic here
                      if (a>b && a>c)
                      {
                          System.out.println(a);
                      }
                      else if(b>a && b>c)
                      {
                          System.out.println(b);
                      }
                      else
                      {
                          System.out.println(c);  
                      }
           }
}
