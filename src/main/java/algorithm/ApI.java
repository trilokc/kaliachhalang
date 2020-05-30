package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ApI {
	
	public static void main(String[] args)  {
		
		ApI api = new ApI();
		api.stringGroupOne(); 
		api.stringGroupTwo(); 
		api.sizeGroupOne(); 
		
		
		//ApI.stringGroupOne(); 
		
		
		
		
	}
	String s = "Vsishnu is a good psychiatrist"; 
	 void stringGroupOne() {                           // Static 
		//String s = "Vsishnu is a good psychiatrist"; 
		char c = s.charAt(3); 
		System.out.println("charat -> " + c);
		int i = s.indexOf("sh"); 
		System.out.println("indexOf -> " + i);
		int length = s.length(); 
		System.out.println("length -> " + length);
	}
	
	void stringGroupTwo() { 
		//String s = "Vsishnu is a good psychiatrist";
		boolean b = s.contains("trist");
		System.out.println("contains -> " + b);
		boolean bb = s.startsWith("Vsishnu"); 
		System.out.println("startswith -> " + bb);
		boolean bbb = s.endsWith("psychiatrist"); 
		System.out.println("endsWith -> " + bbb);
		String subsone = s.substring(3); 
		System.out.println("substring -> " + subsone);
		String substwo = s.substring(2, 5);
		System.out.println("substring -> " + substwo);
	}
	
	void sizeGroupOne() { 
		int[] nums = {2,3,4,5,9}; 
		int[] nums1 = new int[nums.length]; 
		int[] nums2 = new int[]{0,3,5,9}; 
		
		nums1[0] = nums[0] *2;
		nums1[1] = nums[1] *2;
		nums1[2] = nums[2] *2;
		nums1[3] = nums[3] *2;
		nums1[4] = nums[4] *2;
		
		System.out.println(nums.length);
		
		/*for(int i = nums.length-10; i<nums.length; i++) { 
			nums1[i] = nums[i] * 3;
		}
		*/
		
		String[] names = {"Champ","Vishnu","Prerna"}; 
		System.out.println(names.length);
		String nm2 = names[1]; 
		System.out.println(nm2);
		names[1] = "VishnuChandra"; 
		System.out.println(names[1]);
		
		
		
		String s = names[2]; 
		int psize = s.length(); 
		System.out.println(psize);
		
		Set<String> set = new HashSet(); 
		set.add("Lily"); 
		set.add("VishnuChandra"); 
		set.add(names[2]);
		set.add("4"); 
		int setSize = set.size(); 
		System.out.println(setSize); 
		
		Collections.sort(Arrays.asList(names)); 
		Arrays.sort(names);
		
	}
	
	
	
	
	

}
