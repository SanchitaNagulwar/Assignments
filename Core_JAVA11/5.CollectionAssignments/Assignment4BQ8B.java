package ExceptionHandling;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class Assignment4BQ8B {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<Integer>(new Integer[] { 2, 4, 6, 9 });

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer no = (Integer)itr.next();
            System.out.println(no);
            if (no == 8)
                list.add(14);
        }
    }
}
