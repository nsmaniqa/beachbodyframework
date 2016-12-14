package javaDayas;

public class MethodOverLoading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading1 obj =new MethodOverLoading1();
		String x=obj.sum(100, "hi", 100.12);
		int y=obj.sum(10, 20, 30);
		System.out.println(x+y);
	}
public int sum(int a, int b,int c)
{
	return a+b;
}
	public String sum(int a, String b,double  c)
	{
		return a+b+c;
	}
}

