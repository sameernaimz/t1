package day28_arrayList;
/*
    HTML Generator

    Given a String in the following format take the number part of the generator the html tags.
    Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

    Ex:
        Input:
            div^2
        Output:
            <div></div> <div></div>

    Ex:
        Input:
            li^3
        Output:
            <li></li><li></li><li></li>

 */
public class HtmlGenerator {
    public static void main(String[] args) {

        String str = "div^2";

        System.out.println(htmlGenerator(str));
        System.out.println(htmlGenerator("li^3"));
        System.out.println(htmlGenerator("span^5"));
    }

    public static String htmlGenerator(String str) {

       // str.split("\\^");
       String [] arr =  str.replace("^", " ").split(" "); // ["div", "2"]

        int num = Integer.parseInt(arr[arr.length-1]);  // "2" ---> 2
        String html = "";



       //   <div></div> <div></div>
        for (int i = 0; i < num; i++) {

            html += "<" + arr[0] + "></" + arr[0] + ">";
        }

        return html;
    }
}
