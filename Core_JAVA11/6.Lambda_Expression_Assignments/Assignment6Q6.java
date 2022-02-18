package Lambda;

import java.util.Arrays;
import java.util.List;

public class Assignment6Q6 {

    interface  ConvertToUpperCase{
        public List<String> convertToUpperCase(List<String> list);
    }

    public static ConvertToUpperCase convertToUpperCase(){
        return (list)->{
            list.replaceAll(i-> String.valueOf(i.charAt(0)).toUpperCase()+i.substring(1));
            return list;
        };
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("maths", "science", "history", "civics", "Drawing", "geography");

        System.out.println("List before converting first letter to uppercase: ");
        for (String i: list){
            System.out.println(i+" ");
        }
        System.out.println();

        list = convertToUpperCase().convertToUpperCase(list);

        System.out.println("List after converting first letter to uppercase: ");
        for (String i: list){
            System.out.println(i+" ");
        }
        System.out.println();

    }
}

