package javaDayas;

public class MethodWithReturnType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithReturnType2 obj=new MethodWithReturnType2 ();
		System.out.println(obj.add("hi", "howru")+obj.add("yes", "imfine", "howaboutyou"));
		//String x= obj.add("hellow","howru");
		
	}
public String add(String a, String b, String c)
{
	return a+b+c;
}
	public String add(String a,String b)
	{
		return a+b;
	}
	
}
