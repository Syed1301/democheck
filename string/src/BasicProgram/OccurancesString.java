package BasicProgram;

public class OccurancesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 245;
		String a =" samplea";
	    char []b=a.toCharArray();
	    int find[]=new int[n];
	    int count=0;
	    
	    for(int i=0;i<b.length;i++) {
	    	find[a.charAt(i)]++;
	    }
	    
	    for(int i=1;i<b.length;i++) {
	    	if(a.charAt(i)==b[i]) {
	    		count++;
	    		
	    	}
	    
	    if(count!=0) {
	    	System.out.println("The Occurances "+a.charAt(i)+" the Character of "+find[a.charAt(i)]);
	    }
	    }
	   
	}

}
