package OOPConcept;

public class CallByVal {

	public static void main(String[] args) {
		CallByVal obj=new CallByVal();
		int x=10;
		int y=20;
		obj.sum(x, y); // --call by val OR pass by val
	}
	
	public void sum(int a,int b)
	{
		//a=20;
		//b=30;
		int c=a+b;
		System.out.println(c);
	}

}
