package Lambda;

import java.util.HashMap;
import java.util.Map;

public class Assignment6Q7 {

    interface ConvertKeyValueToString{
        public String convertKeyValueToString(HashMap<String, Integer> map);
    }

    public static  ConvertKeyValueToString convertKeyValueToString(){
        return (map)->{
            String result="";
            for(Map.Entry<String,Integer> mp: map.entrySet()){
                String key = mp.getKey();
                int value = mp.getValue();

                result += key + Integer.toString(value);
            }
            return result;
        };
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Eash",8);
        hashMap.put("piyu",2);
        hashMap.put("yug",7);
        hashMap.put("sonu",4);
        hashMap.put("sanchi",5);

        System.out.println("String after append key-value all pairs into a single string:\n");

        System.out.println(convertKeyValueToString().convertKeyValueToString(hashMap));
    }
}
