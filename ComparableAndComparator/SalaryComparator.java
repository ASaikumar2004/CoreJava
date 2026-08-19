package ComparableAndComparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Emp> {

//	@Override
//	public int compare(Emp e1, Emp e2) {
//		return Double.compare(e1.salary, e2.salary);
//	}
	
	@Override
	public int compare(Emp e1, Emp e2) {
		return Double.compare(e2.salary, e1.salary);
	}
	
//	@Override
//	public int compare(Emp e1, Emp e2) {
//		return e1.name.compareTo(e2.name) ;
//	}
	
//	@Override
//	public int compare(Emp e1, Emp e2) {
//		return Integer.compare(e1.age, e2.age) ;
//	}
	
//	@Override
//	public int compare(Emp e1, Emp e2) {
//		return Integer.compare(e1.age, e2.age) ;
//	}
	

}
