
import java.util.Comparator;

public class CompareByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String name1 = o1.getName().substring(o1.getName().lastIndexOf(" "));
        String name2 = o2.getName().substring(o2.getName().lastIndexOf(" "));
        if (name1.compareTo(name2) == 0) {
            name1 = o1.getName().substring(o1.getName().indexOf(" "), o1.getName().lastIndexOf(" "));
            name2 = o2.getName().substring(o2.getName().indexOf(" "), o2.getName().lastIndexOf(" "));
            return name1.compareTo(name2);
        }

        return name1.compareTo(name2);
    }

}
