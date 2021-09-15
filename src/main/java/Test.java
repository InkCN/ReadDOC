import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1","1");
        Set<Map.Entry<String, String>> entries = map.entrySet();

      for (Map.Entry<String, String> entry : entries) {
          String key = entry.getKey();
          System.out.println(key);
      }
    }
}
