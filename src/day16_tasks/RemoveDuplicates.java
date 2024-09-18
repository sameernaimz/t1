package day16_tasks;

public class RemoveDuplicates {
    public static void main(String[] args) {
    // I HAVE DUPLICATE ABC I NEED TO REMOVE ONE
        String str = "abcabc";
        String result = "";
        // assign new result

        // iterate through each char find duplicate 1 by 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //contains method checks if result string is in ch
            if (!result.contains(String.valueOf(ch))) {
                result += ch;
            }
        }
        System.out.println("Result: " + result);
    }
}
