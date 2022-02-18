package ExceptionHandling;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person{
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name = "+this.name+"| Height = "+this.height+"| Weight = "+this.weight;
    }
}
class HeightComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {

        if(o1.weight>o2.weight){
            return -1;
        }
        else if(o1.weight<o2.weight){
            return 1;
        }
        else {
            return Double.compare(o2.height, o1.height);
        }
    }
}

public class Assignment4BQ1 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(new HeightComparator());
        set.add(new Person("Sanchita",141,42));
        set.add(new Person("Sakshi",123,46));
        set.add(new Person("Piyush",342,50.1));
        set.add(new Person("Parth",345,67.4));
        set.add(new Person("Eash",125,45.5));
        

        System.out.println("Printing in the sorted order based upon weight first, if the weights are equal then based upon height:");
        for (Person person: set){
            System.out.println(person);
        }
    }
}
