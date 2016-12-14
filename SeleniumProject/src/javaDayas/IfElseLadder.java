package javaDayas;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=00;
		int b=30;
		int c=300;
		if(a>b && a>c)
		{
			System.out.println(a + " is biggest number");
		}
        else if(b>a && b>c)
        {
        	System.out.println(b + "is biggest number");
        	
        }
        else if (c>a && c>b)
        {
        	System.out.println(c+ " biggest number");
        }
        else
        {
        System.out.println("check the number");	
        }
	}
	

}
