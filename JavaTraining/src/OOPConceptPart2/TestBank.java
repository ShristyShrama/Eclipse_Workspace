package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		b.carloan();
		b.eduloan();
		b.mutualfund();
		
		System.out.println("*******");
		
		USBank b1=new HSBCBank(); //child class object is reffered by parent Interface--dynamic polymorphism
		b1.credit();
		b1.debit();
		b1.transfermoney();
		}

}
