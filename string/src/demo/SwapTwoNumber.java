 package demo;

public class SwapTwoNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// With third variable using 
		int a= 10;
		int b= 20;
		int c;
        
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        
        
        c= a;
        a=b;
        b=c;
        
        System.out.println("After a "+a);
        System.out.println("After b "+b);
        
       
         
        //without third variable using
        int x =25; 
        int y =23;
        
        x = x+y;  
        y=x-y;
        x=x-y;
        
        System.out.println(x);
        System.out.println(y); 
         
        
        
	}

}
