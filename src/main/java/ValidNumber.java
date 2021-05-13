import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidNumber {

    public void validNumberMethod(String numberText) {
        try {

            BufferedReader bis = new BufferedReader(new FileReader(numberText));
            String line = bis.readLine();
            while (line != null) {
                if (line.matches("\\([0-9]{3}\\)\s[0-9]{3}\\-[0-9]{4}") || line.matches("[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}"))
                    //System.out.println(line);
                    System.out.println(line + "\n");
                line = bis.readLine();
            }

        } catch (
                IOException e) {
            System.out.printf(e.getMessage());
        }
    }

}

