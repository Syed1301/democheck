package BasicProgram;

import java.util.Comparator;

public class Name implements Comparator<EmpDetails>{

	@Override
	public int compare(EmpDetails o1, EmpDetails o2) {
		return o1.Name.compareTo(o2.Name);
	}

	

}
