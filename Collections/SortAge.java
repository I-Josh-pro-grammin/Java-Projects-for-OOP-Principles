
import java.util.Comparator;

public class SortAge implements Comparator<Employee> {

    @Override
    public int compare(Employee emp, Employee emp2) {
        return  Integer.compare(emp.getAge(), emp2.getAge());
    }
}
