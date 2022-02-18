package ExceptionHandling;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Assignment4BQ8A {
    public static void main(String[] args) {
        Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Mumbai", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");

        Iterator<String> iterator = cityCode.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));

            cityCode.put("Pune", "India");
        }
    }
}
