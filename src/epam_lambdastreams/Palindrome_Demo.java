package com.epam_lambdastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Palindrome_Demo {
	public static void main(String[] args) {
        List<String> al = Arrays.asList("devi","mom","1515","tenet","level","11");
        List<String> s= Palindrome_Demo.find_Palindrome(al,(str) ->Palindrome_Demo.checkPalindrome((String) str));
        System.out.println("List of Palindromes: " +s);
    }
 
    public static boolean checkPalindrome(String string) {
    	StringBuffer sb =new StringBuffer();
    	for(int i = string.length()-1; i >= 0 ; i--)
    		sb = sb.append(string.charAt(i));
    	if(string.equalsIgnoreCase(sb.toString()))
    		return true;
    	else 
    		return false;
    } 
    public static List<String> find_Palindrome(List<String> l, Predicate<String> p) { 
    	List<String> ls = new ArrayList<String>(); 
    	l
    	.stream()
    	.filter((i) -> (p.test((String) i))).forEach((i) -> {
            ls.add((String) i);
        });
        return ls;

}

}
