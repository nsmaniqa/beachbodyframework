package javaDayas;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String status="ki";
int x =100;
if(status=="hi")
{
	if(x%2 ==0)
	System.out.println( x +" is even  number");
		
	else
		System.out.println(x +" is add number");
}

else if(status=="ki")
{
	System.out.println(x*100);
}
else
{
	System.out.println("invalid status");
}
	}

}
