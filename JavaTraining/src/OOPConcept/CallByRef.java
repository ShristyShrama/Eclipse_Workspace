package OOPConcept;

public class CallByRef { // passing obj reference is called call by ref 

	int p;
	int q;
	
	public static void main(String[] args) {
	CallByRef obj=new CallByRef();
	obj.p=50;
	obj.q=90;
	
	obj.swap(obj);
	System.out.println("Swaping");
	System.out.println(obj.p);
	System.out.println(obj.q);

	}
	
	public void swap(CallByRef obj)//-- passing obj reference 
	{
		int temp=obj.p;
		obj.p=obj.q;
		obj.q=temp;
	}

}
