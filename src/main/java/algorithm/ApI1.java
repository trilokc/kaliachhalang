package algorithm;

import java.util.List;

public class ApI1 implements Contractwork {
	
	public int sumup(int[] nums) {   // [3,4,5,7]   [9,2,5,4,34,55,22,100] [4,2,3000,50050,2000000]
		
		int total = 0; 
		
		if(nums != null) {
			if(nums.length > 0) {
				for(int i = 0; i < nums.length; i++) { 
			    	total = total + nums[i]; 
			    	
			    }
			}
			
		}
	    
		return total; 
	}

	@Override
	
	public int sumupOddNumbers(int[] nums) {
		int tot = 0; 
		if(nums == null || nums.length < 1) return tot; 
		for(int i=0; i<nums.length; i++) { 
			int num =  nums[i]; 
			if(num % 2 != 0) { 
				tot = tot + num; 
			}
		}
		return tot;
	}

	@Override
	public int sumUpEvenNumbers(int[] nums) {
		int total = 0;
		if(nums == null || nums.length < 1) return total; 
		for(int i = 0; i < nums.length; i++) { 
			int num = nums[i]; 
			if(num % 2  == 0) { 
				total = total + num; 
			}
		}
		return total;
	}

	@Override
	public int sumUpFirstFiveBuckets(int[] nums) {
		int sum = 0; 
		if(nums == null || nums.length < 5) return sum; 
		for(int i = 0; i<5; i++) {
			int num = nums[i];
			sum = sum + num; 
		}
		return sum;
	}

	@Override
	public int sumUpLastFiveBuckets(int[] nums) {
		if(nums == null || nums.length < 5) return 0;  
		int total = 0; 
		for(int i = nums.length - 5; i < nums.length; i++) {
			
			int number = nums[i]; 
			System.out.println(number + " " + i);	
			total = total + number; 
		}
		return total;
	}
	
	public int sumUpFromFifthToSecondLast(int[] nums) throws Exception {
		if(nums == null && nums.length < 7)  return 0;
		int total = 0; 
		for(int i = 4; i < nums.length-1; i++) {
			int number = nums[i]; 
			total = total + number; 
		}
		return total; 
		
	}

	@Override
	public int[] reverseTheArray(int[] nums) throws Exception {  // [4,9,2,3,1,7]
		if(nums == null || nums.length < 2) throw new Exception("Either it's a null or the bucket is not at least two"); 
		for(int i=0, p = nums.length -1;  i<nums.length/2; i++, p--) {
			int start = nums[i]; 
			int end = nums[p];
			int temp = start; 
			nums[i] = nums[p];
			nums[p] = temp; 
		}
		return nums;
	}

	@Override
	public int[] swapSecondAndThirdBucket(int[] nums)  {
		if(nums == null || nums.length < 3) return null; 
		return null;
	}
	
	public int[] swapSecondAndThirdBucketOne(int[] nums)  {
		if(nums == null || nums.length < 3) throw new RuntimeException("Invalid Array Of Int"); 
		int temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp; 
		return nums;
	}

	@Override
	public String[] swapSecondAndThirdBucket(String[] names) { // ["Vishnu","Prerna","Luke","Taylor","Linet","Trylock","Champ"]
	   if(names == null || names.length < 3) return null;
	   String second = names[1]; 
	   String third = names[2]; 
	   String temp = second; 
	   second = third;
	   third = temp; 
	   names[1] = third; 
	   names[2] = second; 
		return names;
	}

	@Override
	public String[] reverseTheStringOfThirdBucketAndPutInFifthBucket(String[] names) {
		if(names == null || names.length < 5) return null; 
		String item = names[2];
		StringBuilder sb = new StringBuilder(item);
		StringBuilder sbres = sb.reverse(); 
		String result = sbres.toString(); 
		names[4] = result; 
		return names;
	}
	
	public String[]  reverseTheStringOfThirdBucketAndPutInEightBucket(String[] names) {
		if(names == null || names.length < 8) return null; 		
		String item = names[2];
		StringBuilder sb = new StringBuilder(item);
		StringBuilder sbres = sb.reverse(); 
		String result = sbres.toString(); 
		names[7] = result; 
		return names;
	}
	
	public String[]  reverseTheStringOfThirdBucketAndPutInEightBucketOne(String[] names) {
		if(names == null || names.length < 8) return null; 	
		String[] copiedArray = new String[names.length]; 
		for(int i = 0; i < names.length; i++) {
			copiedArray[i] = names[i];
		}
		String item = copiedArray[2];
		StringBuilder sb = new StringBuilder(item);
		StringBuilder sbres = sb.reverse(); 
		String result = sbres.toString(); 
		copiedArray[7] = result; 
		return copiedArray; 
	}
	
	public List<Integer> reverseTheArray(List<Integer> nums) throws Exception {  // [4,9,2,3,1,7]
		if(nums == null || nums.size() < 2) throw new Exception("Either it's a null or the bucket is not at least two"); 
		for(int i=0, p = nums.size() -1;  i<nums.size()/2; i++, p--) {
			int start = nums.get(i); 
			int end = nums.get(p);
			int temp = start; 
			nums.set(i,nums.get(p));
			nums.set(p,temp); 
		}
		return nums;
	}

}
