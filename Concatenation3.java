# Concatenation3


package com.naresh;
 
public class StringUtil {
 
    public static String getFullName(String firstName, String lastName) {   
        String fullName = firstName + lastName;
        return fullName;
    }
}



public class TestString {
 
    public static void main(String[] args) {
 
        // input
        String firstName = "Naresh";
        String lastName = "Kumar";
 
        String fullName = StringUtil.getFullName(firstName, lastName);
 
        // output
        System.out.println(fullName);
 
    }
}
