package com.epam_lambdastreams;

import java.util.*;
import java.util.stream.Collectors;

public class FindString {
	public static List<String> search(List<String> list) {
		return list.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
		}
		public static void main(String[] args) {
			List<String> al = new ArrayList<String>();
			 al.add("adcdef"); 
		     al.add("abcdefgh"); 
		     al.add("klef");
		     al.add("air");
		     al.add("App");
		     al.add("Durga");
		     al.add("act");
		     List<String> str = search(al); 
		     System.out.println("Three letter string that starts with character 'a' : "+str);

		}


}
