package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApiTest {
	@Test
	public void m1() { 
		ApI1 api = new ApI1(); 
		try{
		int[] result = api.reverseTheArray(new int[]{3,5,7,9});
		assertTrue(result[0] == 9);
		assertEquals(result[result.length - 1], 3); 
		//assertEquals(result, new int[]{9,7,5,3}); 
		}catch(Exception e){
			
		}
	}
	@Test
	public void m2() { 
		
	}
	@Test
	public void m3() { 
		
	}
	@Test
	public void m4VVVVVVVVVVv() {
		
	}
	@Test
	public void m5QQQQQQQQQQQ() {
		
	}
/*	
	
	
	new branch for developing 10 features
	
	
	
	
	
	
	
	*/
	@Test
	public void m10() {
		
	}

}
