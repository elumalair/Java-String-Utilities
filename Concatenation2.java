# Concatenation2

public class TestString {
 
    public static void main(String[] args) {
 
        //input
        String firstName = "Naveen" ;
        String lastName = "Kumar";
         
        String fullName = getFullName(firstName, lastName);     
         
        //output
        System.out.println(fullName);
    }
 
    private static String getFullName(String firstName, String lastName) {
        //business logic
        String fullName = firstName + lastName;
        return fullName;
    }
}
