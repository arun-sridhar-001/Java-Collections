package comparator;

import arrayList.model.Employee;

import java.util.Comparator;


public class ComparatorImpl implements Comparator<EmployeeComparator> {

    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        if(o1.getSalary() < o2.getSalary()) {
            return 1;
        }

        return -1;
    }
}
