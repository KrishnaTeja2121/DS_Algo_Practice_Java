package Arrays;

import java.util.HashSet;
import java.util.Set;

public class longest_substring_without_repeating_characters {

	public static void main(String[] args) {
		String s="abcabcde";
		System.out.println(lengthofLongestSubstring(s));

	}
	
	public static int lengthofLongestSubstring(String s) {
		Set<Character> set=new HashSet<>();
		int left=0;
		int max=0;
		
		for(int right=0; right< s.length();right++) {
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left++));
			}
			set.add(s.charAt(right));
			max= Math.max(max, right-left+1);
		}
		return max;	
		
	}

}
