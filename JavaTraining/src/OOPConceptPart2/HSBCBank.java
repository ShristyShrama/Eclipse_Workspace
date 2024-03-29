package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{  //we are achieving multiple inheritance
	//Is-a relationship 
	    
	    //If a class implements an Interface,then it is mandatory to define/override all methods of Interface  
		//these 3 methods are overriden from USBank
		public void credit(){
			System.out.println("USBank--credit");
		}
		
		public void debit(){
			System.out.println("USBank--debit"); 
		}
		
		public void transfermoney(){
			System.out.println("USBank--tranfermoney"); 
		}
		
		//these 2 are HSBCBank seperate methods
		public void eduloan(){
			System.out.println("HSBCBank--eduloan");
		}
		
		public void carloan(){
			System.out.println("HSBCBank--carloan");
		}
		
		//this method is from brazil interface
		public void mutualfund() {
			System.out.println("BrazilBank--mutualfund");
		}
}
