import java.io.*;
class Temperature
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int temp;
System.out.println("Enter the value for temperature");
temp=Integer.parseInt(br.readLine());
if(temp<0)
System.out.println("Freezing weather");
else if(temp>=0 && temp<10)
System.out.println("Very Cold weather");
else if(temp>=10 && temp<20)
System.out.println("Cold weather");
else if(temp>=20 && temp<30)
System.out.println("Normal in Temperature");
else if(temp>=30 && temp<40)
System.out.println("Hot");
else
System.out.println("Very Hot");
}
}
