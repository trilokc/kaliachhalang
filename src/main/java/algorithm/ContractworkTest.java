package algorithm;

import java.util.ArrayList;
import java.util.List; 


public class ContractworkTest {

	public static void main(String[] args)  {
		int[] ints1 = {5,7,3,9,13}; 
		int[] ints2 = new int[]{5,7,3,9,13}; 
		int[] ints = new int[5]; 
		ints[0]=5;
		ints[1]=7;
		ints[2]=3;
		ints[3]=9;
		ints[4]=13;
		
		int[] ints3 = null; 
		
		
		Contractwork api = new ApI1();
		int sumresult = api.sumup(new int[]{5,7,3,9,13}); 
		System.out.println(sumresult);
		
		
		
		
		
		
		try{
			int[] result = api.swapSecondAndThirdBucket(ints1); 
			//System.out.println(result);
			int[] result1 = api.reverseTheArray(new int[]{40,60,70});
			//System.out.println(Arrays.toString(result1));
			for(int i = 0; i < result1.length; i++) { 
				int num = result1[i]; 
				System.out.print (num + " "); 
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		List<Integer> numslist = new ArrayList(); 
		/*numslist.add(5);
		numslist.add(9);
		numslist.add(13);
		numslist.add(19);*/ 
		numslist.add(25); 
		ApI1 self = new ApI1();
		try{
			List<Integer> resultnumlist = self.reverseTheArray(numslist);
			System.out.println(resultnumlist);
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		
		
		
		/*List<Integer> resultnumlist = self.reverseTheArray(numslist);
		System.out.println(resultnumlist);*/
		
		ApI1 selfie = new ApI1(); 
		int[] ne = new int[]{9,3,8,10};
	    selfie.swapSecondAndThirdBucketOne(ne);
		for(int i = 0; i < ints1.length; i++) { 
			int num = ints1[i]; 
			System.out.print(num + " "); 
		}

			
	}

}
