package ExceptionHandling;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment4BQ2 {
    public static HashSet<Integer> unordered(HashSet<Integer> hashSet){
        hashSet.add(45);
        hashSet.add(23);
        hashSet.add(67);
        hashSet.add(15);
        hashSet.add(34);

        return hashSet;
    }
    public static LinkedHashSet<Integer> ordered(LinkedHashSet<Integer> linkedHashSet){
        linkedHashSet.add(56);
        linkedHashSet.add(33);
        linkedHashSet.add(1);
        linkedHashSet.add(56);
        linkedHashSet.add(89);

        return linkedHashSet;
    }
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        hashSet = unordered((HashSet<Integer>) hashSet);
        linkedHashSet = ordered((LinkedHashSet<Integer>) linkedHashSet);

        System.out.println("Elements in HashSet: ");
        for(Object i:hashSet){
            System.out.print(i+" ");
        }
       


        System.out.println("\nElements in LinkedHashSet: ");
        for(int i:linkedHashSet){
            System.out.print(i+" ");
        }
    }
}