import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  LinkedHashSet<Person> p=new LinkedHashSet<>();
  p.add(new Person(1,"arbaz",'M',12000));
  p.add(new Person(2, "shahid", 'M', 10000));
  Iterator<Person>p1=p.iterator();
  while (p1.hasNext()) {
    System.out.println(p1.next());
  }
}
}
