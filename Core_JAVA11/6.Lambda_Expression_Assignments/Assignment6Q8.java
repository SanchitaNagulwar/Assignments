package Lambda;

import java.util.Arrays;
import java.util.List;

class Thread extends java.lang.Thread{
    public void Display_Numbers(List<Integer> list){
        for (int i:list){
            System.out.print(i+" ");
        }
    }
}

@Deprecated 
public class Assignment6Q8 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();

        List<Integer> list = Arrays.asList(5,4,7,2,8,3,8,2,9);
        System.out.println("Printing numbers from the list: ");
        thread.Display_Numbers(list);

        thread.stop();
    }
}
