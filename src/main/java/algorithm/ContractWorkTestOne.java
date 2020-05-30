package algorithm;

public class ContractWorkTestOne {
	
	void print(String[] strings2) { 
		if(strings2 == null) return; 
		for(int i = 0; i < strings2.length; i++) { 
			String res = strings2[i]; 
			System.out.println(res); 
		}
	}
	
	void print(int[] strings2) { 
		if(strings2 == null) return; 
		for(int i = 0; i < strings2.length; i++) { 
			int res = strings2[i]; 
			System.out.println(res); 
		}
	}
	
	void callOneOfWorkers() throws Exception {
		int[] ints1 = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] ints2 = null; 
		int[] ints3 = new int[]{1}; 
		
		int[] num3 = {4,5,9,10}; 
		int[] num1 = new int[]{1,2,3};		
		int[] num4 = new int[]{3,6,7}; 
		int[] num2 = new int[3];
		num2[0] = 1;
		num2[2] = 2;
		num2[1] = 5; 
		
		
		/*Friend f1 = new Friend();
		Friend f2 = new Friend();
		Friend f3 = new Friend(); 
		
		Friend[] friends = {f1,f2,f3}; 
		Friend[] friends1 = new Friend[3];
		friends1[2] = f2;
		friends1[1] = f1;
		friends1[0] = f3; 
		
		friends1[2] = new Friend(); 
		Friend[] friends2 = new Friend[]{f1,f2,f3,null};
		
		Friend frs = convertEnemyIntoFriend(new Enemy()); */
		
		String[] strings1 = {"Vishnu","Prerna","Trylock","Youseff","Geerald","Harry","Melissa","Barry","James","Celia"};
		String[] strings2 = {"Vishnu","Prerna","Trylock","Youseff","Geerald"};
		
		ApI1 api = new ApI1(); 
		
		int hld = api.sumup(ints1); 
		System.out.println(hld);
		
		try{
			//api.reverseTheArray(ints1); 
			for(int i = 0; i < ints1.length; i++) {
				int hld1 = ints1[i]; 
				System.out.println(hld1); 
			}
		}catch(Exception e) {
			
		}
		
		String[] strings = api.reverseTheStringOfThirdBucketAndPutInEightBucketOne(strings1);
		print(strings); 
		
		String[] strings3 = api.reverseTheStringOfThirdBucketAndPutInEightBucketOne(new String[]{"Parth","Gary","abcd","here","put","Fan","Benjamin","Henry"});
		print(strings3); 
		
		int result5 = api.sumUpLastFiveBuckets(ints1); 
		System.out.println(result5);
		
		int result55 = api.sumUpLastFiveBuckets(new int[]{4,6,7,3,8}); 
		System.out.println(result55);
		
		int resultanswer = api.sumUpFromFifthToSecondLast(new int[]{5,4,3,3,2,1,9}); 
		System.out.println(resultanswer); 
		
		int[] resultanswer5 = api.swapSecondAndThirdBucket(new int[]{1,3,5,9,11});
		print(resultanswer5); 
		
		
		/*api.reverseTheStringOfThirdBucketAndPutInFifthBucket(null);
		print(null); 
		
		int res3 = api.sumUpEvenNumbers(ints1);
		System.out.println(res3);
		int res35 = api.sumUpEvenNumbers(new int[]{4,6,8,10,12,13,15,11,2,3,5});
		System.out.println(res35);
		
		int res4 = api.sumupOddNumbers(ints1);
		System.out.println(res4);
		int res45 = api.sumupOddNumbers(new int[]{1,2,3,4,5,6,7,1,5});
		System.out.println(res45);
		*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void callManager()  { 
		try{
		callOneOfWorkers(); 
		}catch(Exception e) {
			
		}
		
	}

	public static void main(String[] args)  {
		ContractWorkTestOne cwto = new ContractWorkTestOne(); 
		cwto.callManager(); 
		
		

	}

}
