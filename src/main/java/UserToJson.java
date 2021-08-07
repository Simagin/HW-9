import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserToJson {

    public void UserToJsonMethod(String users) {

        List<People> arrayList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(users))) {
            String line = br.readLine();
            String[] arr;
            while (line != null) {
                arr = line.split(" ");

                if (!("name".equals(arr[0]) && "age".equals(arr[1])) && !(line.isBlank())) {
                    arrayList.add(new People(arr[0], Integer.parseInt(arr[1])));
                    line = br.readLine();
                } else {
                    line = br.readLine();
                }
            }
        } catch (Exception e) {
            System.out.println("========Exception e=========" + e);
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.json"))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(arrayList);
            bufferedWriter.write(json);
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



