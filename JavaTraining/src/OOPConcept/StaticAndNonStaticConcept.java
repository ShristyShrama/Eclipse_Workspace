package OOPConcept;

public class StaticAndNonStaticConcept {
	
	String name="Tom"; //non-static global var
	static int age=25; //static global var
	
    public static void main(String[] args) {
		
    	// how to access static methods & variables
    	//1.direct calling
    	sum();
    	System.out.println(age);
    	//2.call by classname
    	StaticAndNonStaticConcept.sum();
    	System.out.println(StaticAndNonStaticConcept.age);
    	
    	//how to access non static methods & variables
    	//1.By creating object
    	StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
    	System.out.println(obj.name);
    	obj.sendmail();
    	
    	//Can I access static method by object reference? yes
    	obj.sendmail();

	}
    
    public void sendmail()	//non static method  
    {
    	System.out.println("Sendmail method");
    }

    public static void sum()	//static method
    {
    	System.out.println("Sum method");
    }
}
