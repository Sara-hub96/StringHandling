/*String handling
        Define a string called string1 that has assigned the value "Hello"
        Define a string called string2 that has assigned the value "How are you?"
        Take the first 2 characters string1 and the last 2 characters of string2 and combine the 4 chars (Heu?)
        into a dedicated array called charArray
        Print charArray*/

public class Main {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        String subString = string1.substring(0, 2) + string2.charAt(string2.length()-2) + string2.charAt(string2.length()-1);

        char[] charArray = new char[4];
       charArray[0] = subString.charAt(0);
        charArray[1] = subString.charAt(1);
         charArray[2] = subString.charAt(2);
          charArray[3] = subString.charAt(3);

        System.out.println(charArray);


    }
}