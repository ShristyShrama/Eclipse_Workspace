package JavaPackage;

public class TwoDimArray {
	
public static void main(String[] args) {
		
		String [][]x=new String[3][5]; 
		
		x[0][0]="A1";
		x[0][1]="A2";
		x[0][2]="A3";
		x[0][3]="A4";
		x[0][4]="A5";
		
		x[1][0]="B1";
		x[1][1]="B2";
		x[1][2]="B3";
		x[1][3]="B4";
		x[1][4]="B5";
		
		x[2][0]="C1";
		x[2][1]="C2";
		x[2][2]="C3";
		x[2][3]="C4";
		x[2][4]="C5";
		
		System.out.println(x[2][4]);
		System.out.println(x.length); //length of row
		System.out.println(x[0].length); //length of col
		
		for(int row=0; row<x.length; row++)
		{
			for(int col=0; col<x[0].length; col++)
				System.out.println(x[row][col]);
		}
		}

}
