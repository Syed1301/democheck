package demo;

public class VowelPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String st = new String("Helloa");
		 
		
		 for(int i =0; i<st.length();i++) {
			 
			 if(st.charAt(i) == 'a'  || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
					 || st.charAt(i) == 'u') {
				 char k = st.charAt(i);
				 
				 System.out.println("This Vowel of present in Index: "+ k +"  "+"Or Index Value is  "+ i);
				
				 
				
			 }
		 }
		 
	}

}
