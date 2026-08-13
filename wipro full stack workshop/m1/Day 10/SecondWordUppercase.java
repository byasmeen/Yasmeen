public class SecondWordUppercase {
    public static String secondWordUppercase(String input1) {
        if (input1 == null) {
            return "LESS";
        }
        String[] words = input1.trim().split("\\s+");
        if (words.length < 2) {
            return "LESS";
        }
        return words[1].toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(secondWordUppercase("Wipro Technologies Bangalore"));
        System.out.println(secondWordUppercase("Hello"));
    }
}
