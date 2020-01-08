public class TestStringReverse {
 
    public static void main(String[] args) {
         
        String name = "Ram";
         
        StringBuilder content = new StringBuilder();
        content.append(name);
         
        //Reverse the String
        content.reverse();
 
        System.out.println(content);
    }
 
}
