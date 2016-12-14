package javaDayas;

public class StaticMethod {
	public String studentname ;
	public int tamilmarks;
	public int englishmarks;
	public int mathmarks;
	public int seciencemarks;
	public int socialsciencemarks;
	public double avg;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod obj=new StaticMethod();
		StaticMethod obj1=new StaticMethod();
		
	}
public static int average(int a,int b,int c,int d, int e)
{
	return (a+b+c+d+e)/5;
}
}
