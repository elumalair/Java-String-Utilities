package com.naresh;
 
public class StringUtil {
 
    public String getFullName(final String firstName, final String lastName) {
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
 
        //create an object and invoke the method
        final StringUtil sUtilObj = new StringUtil();
        final String fullName = sUtilObj.getFullName(firstName, lastName);
 
        // output
        System.out.println(fullName);
 
    }
 
}
