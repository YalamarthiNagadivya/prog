import java.io.*;
import java.util.Scanner;
public class NumberGame{
          public static void main(String []args) {
             //Write your code here   
             int n;
             Scanner sc= new Scanner(System.in);
             n=sc.nextInt();
             int[] a= new int[n];
             for(int i=0;i<n;i++)
                 a[i]=sc.nextInt();
             String res="";
             //Aman makes first move so i = 0, 2, 4, 6 will be aman turn numbers
             for(int i=0;;i++){
                 int ind=-1;
                 for(int j=0;j<n;j++){
                     if(a[j]>1){
                         ind=j;
                         break;
                     }
                 }
                 if(ind==-1){
                     if(i%2==0){
                         res="JASBIR";
                         break;
                     }
                     else{
                         res="AMAN";
                         break;
                     }
                 }
                 else{
                 for(int k=a[ind]-1;k>=1;k--){
                     if(a[ind]%k==0){
                         a[ind]=k;
                         break;
                     }
                 }
                 }
                 
             }
             System.out.println(res);
          }
}
