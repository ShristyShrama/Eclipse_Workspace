package OPPS3;

public class SBI implements USBank, RBI {

	@Override // -- no need to write, this just write to differenciate 
	public void educationLoan() {
		System.out.println("SBI -- educationLoan");
		}

	@Override
	public void carLoan() {
		System.out.println("SBI -- CarLoan");
		}

	@Override
	public void homeLoan() {
		System.out.println("SBI -- homeLoan");
		}

	@Override
	public void debit() {
		System.out.println("SBI -- debit");
		}

	@Override
	public void credit() {
		System.out.println("SBI -- credit");
		}

	@Override
	public void transfermoney() {
		System.out.println("SBI -- transfermoney");
		}

	@Override
	public void trading() {
		System.out.println("SBI -- trading");
		}
	
	//SBI class methods:
	public void mutualfunds() {
		System.out.println("SBI -- mutualfunds");
	}

	public void insurance() {
		System.out.println("SBI -- insurance");
	}
}
