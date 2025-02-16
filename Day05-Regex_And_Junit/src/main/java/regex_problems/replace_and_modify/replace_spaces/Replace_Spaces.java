package regex_problems.replace_and_modify.replace_spaces;

public class Replace_Spaces {
    public static String removingExtraSpace(String str){
        String replacedStr = str.replaceAll("\\s+", " ");

        return replacedStr;
    }
    public static void main(String[] args){
        String str = "This   is an example  with   multiple spaces.  ";

         String newStr=removingExtraSpace(str);
        System.out.println("Original Text: " +str);
        System.out.println("Replaced Text: " + newStr);
    }
}
