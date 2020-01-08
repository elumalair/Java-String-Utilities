public class TestStringReverse {
 
    public static void main(String[] args) {
 
        String name = "Chennai";
 
        char[] nameArray = name.toCharArray();
 
        System.out.println("Printing Array Values :");
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }
 
        System.out.println("Reverse the String Values:");
        for (int i = nameArray.length-1; i >= 0; i--) {
            System.out.println(nameArray[i]);
        }
 
    }
 
}
