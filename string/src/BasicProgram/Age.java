package BasicProgram;

import java.util.Comparator;

public class Age implements Comparator<EmpDetails>{

	

	@Override
	public int compare(EmpDetails o1, EmpDetails o2) {
		if(o1.getAge()==o2.getAge()) {
			return 0;
		}
		else if (o1.getAge()>o2.getAge()) {
			return 1;
		}else
		return -1;

	}

}
