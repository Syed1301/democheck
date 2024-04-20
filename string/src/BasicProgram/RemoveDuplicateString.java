package BasicProgram;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String name = new String("Hello123 World");
	        char cha[] = name.toCharArray();
	        char n[] = new char[cha.length];
	        int k = 0;

	        for (int i = 0; i < cha.length; i++) {
	            boolean isDuplicate = false; // Flag to check if the character is a duplicate

	            for (int j = i + 1; j < cha.length; j++) {
	                if (cha[i] == cha[j]) {
	                    isDuplicate = true; // If duplicate found, set the flag
	                    break; // No need to continue checking duplicates
	                }
	            }

	            if (!isDuplicate) {
	                n[k++] = cha[i];
	            }
	        }

	        // Print the non-duplicate characters
	        System.out.print("String after removing duplicates: ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(n[i]);
	        }
	        System.out.println();
	    }
	
	}


