import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapIntro2 {
    public static void main(String[] args) {

        HashMap<String, String> books = new HashMap<>();

        books.put("978-1-60309-452-8", "A Letter to Jo");
        books.put("978-1-60309-459-7", "Lupus");
        books.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        books.put("978-1-60309-461-0", "The Lab");

        for (Map.Entry<String, String> entry : books.entrySet()) {
            System.out.println(entry.getValue() + " (ISBN: " + entry.getKey() + ")");
        }

        books.remove("978-1-60309-444-3");

        //        books.remove(books.containsValue("The Lab") == true);

        //checking if remove was succesfull, needs more thinking
        // System.out.println(books.get("978-1-60309-461-0"));

        // kosz Pityu, ezt a logikat meg fel kell fogni tobb ev excel utan
        books.values().remove("The Lab");


        books.put("978-1-60309-450-4", "They Called Us Enemy");
        books.put("978-1-60309-453-5", "Why Did We Trust Him?");

        if (books.containsKey("478-0-61159-424-8")){
            System.out.println("we have the key : 478-0-61159-424-8");
        }else{
            System.out.println("we do not have the key : 478-0-61159-424-8");
        }

        System.out.println(books.get("978-1-60309-453-5"));
    }
}