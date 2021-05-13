public class Main {

    public static void main(String[] args) {
        String textCounter = "C:\\projectsJava\\HomeWork_9\\src\\main\\resources\\file.txt";
        WordCount wordCount = new WordCount();
        wordCount.wordCountMethod(textCounter);

        String users = "C:\\projectsJava\\HomeWork_9\\src\\main\\resources\\people.txt";
        UserToJson userToJson = new UserToJson();
        userToJson.UserToJsonMethod(users);

        String numberText = "C:\\projectsJava\\HomeWork_9\\src\\main\\resources\\numberPhone.txt";
        ValidNumber validNumber = new ValidNumber();
        validNumber.validNumberMethod(numberText);
    }

}
