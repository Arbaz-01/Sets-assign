import java.util.HashSet;
import java.util.Iterator;

public class HashSets{
    public static void main(String[] args) {
        HashSet<Person>p1=new HashSet<>();
        p1.add(new Person(1, "bob", 'm', 8000));
        p1.add(new Person(2, "roy", 'm', 9000));
        Iterator p2=p1.iterator();
        while (p2.hasNext()) {
            System.out.println(p2.next());
        }
    }
}
