package OPPS3;

public class TestBank {

	public static void main(String[] args) {
		
		SBI b=new SBI();
		b.educationLoan();
		b.carLoan();
		b.homeLoan();
		
		b.credit();
		b.debit();
		b.transfermoney();
		b.trading();
		
		b.mutualfunds();
		b.insurance();
		
		System.out.println(USBank.min_bal);
		
	    USBank us=new SBI();   //--using interface reference var -- allow to call USBank interface methods only
	    us.credit();
	    us.debit();
	    us.transfermoney();
	    us.trading();
	    
	    RBI rb=new SBI();
	    rb.carLoan();
	    rb.educationLoan();
	    rb.homeLoan();
	    
	    


	}

}
