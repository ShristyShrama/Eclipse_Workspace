package JavaPackage;

public class ArrayConcept {

public static void main(String[] args) {
		
		//1. int array
		int i[]=new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
        System.out.println(i[3]);
       // System.out.println(i[4]); //ArrayOutOfBoundException
        
        System.out.println(i.length);
        
        for(int j=0; j<i.length;  j++)
            System.out.println(i[j]);
        
        
        //2. double array
        double d[]=new double[3];
        
        d[0]=10.23;
        d[1]=12.44;
        d[2]=13.99;
        
        System.out.println(d[2]);
        
        //3. char array
        char c[]=new char[3];
        
        c[0]='a';
        c[1]='b';
        c[2]='c';
        
        System.out.println(c[2]);
        
        //4. boolean array
        boolean b[]=new boolean[2];
        
        b[0]=true;
        b[1]=false;
        
        System.out.println(b[1]);
        
        //5. String array
        String s[]=new String[3];
        
        s[0]="Shristy";
        s[1]="Shrama";
        
        System.out.println(s[0]);
        
        //6. Object array
        Object ob[]=new Object[6];
        
        ob[0]="Shristy";
        ob[1]="Shrama";
        ob[2]=12.33;
        ob[3]=10;
        ob[4]='c';
        ob[5]=true;
        
        for(int z=0; z<ob.length; z++)
        System.out.println(ob[z]);
        }
}
