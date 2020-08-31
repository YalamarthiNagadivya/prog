import java.io.*;
class AcceptDifferent{
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter integer:");
int n=Integer.parseInt(br.readLine());
System.out.print("enter float:");
float f=Float.parseFloat(br.readLine());
System.out.print("enter double float:");
double d=Double.parseDouble(br.readLine());
System.out.print("Entr byte:");
byte b=Byte.parseByte(br.readLine());
//sort,long,boolean,byte  are also similar and called wrapperclasses//
System.out.printf("int=%d%nfloat=%f",n,f);
System.out.println("double="+d);
System.out.println("byte="+b);
}
}