public class FibonacciNumber
{
public static void main(String ar[])
{
int a=0,b=1,c=0;
int n=Integer.parseInt(ar[0]);
System.out.print(a+ " "+b);
for(int i=1;i<n-1;i++)
{
c=a+b;
a=b;
b=c;
System.out.print(" "+c);
}
}
}