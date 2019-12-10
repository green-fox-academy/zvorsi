import java.util.HashMap;

public class mapIntro {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        if (map.size() != 0) {
            System.out.println(map.size());
        }

        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");

        System.out.println(map.keySet());
        System.out.println(map.values());

        map.put(68, "D");

        System.out.println(map.size());

        System.out.println(map.get(99));

        map.remove(99);

        if (map.containsKey(100)){
            System.out.println("map has a key: 100");
        }else{
            System.out.println("map hasn't got key: 100");
        }

        map.clear();

    }
}

