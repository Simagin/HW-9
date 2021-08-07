import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WordCount {

    public void wordCountMethod(String textCounter) {

        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(textCounter))) {
            String line = br.readLine();
            while (line != null) {
                if (!line.isBlank()) {
                    sb.append(line.trim());
                    sb.append(" ");
                }
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("========Exception e=========" + e);
        }

        String[] arr = sb.toString().split(" ");
        for (String str : arr) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                }
                if (o1.getValue() > o2.getValue()) {
                    return 1;
                }
                return 0;
            }
        });

        for (Map.Entry<String, Integer> repastCount : list) {
            System.out.println(repastCount.getKey() + " " + repastCount.getValue());
        }
    }
}
