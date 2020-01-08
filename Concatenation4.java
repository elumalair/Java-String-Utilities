package com.naresh;
 
public class StringUtil {
 
    public static String getFullName(final String firstName, final String lastName) {
        final String fullName = firstName + lastName;
        return fullName;
    }
}


package com.naresh;
 
public class TestString {
 
    public static void main(String[] args) {
 
        // input
        final String firstName = "Naresh";
        final String lastName = "Kumar";
 
        final String fullName = StringUtil.getFullName(firstName, lastName);
 
        // output
        System.out.println(fullName);
 
    }
 
}
