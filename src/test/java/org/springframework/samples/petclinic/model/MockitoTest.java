package org.springframework.samples.petclinic.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse; 
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
//import static org.mockito.Matchers.any;
//import static org.mockito.Matchers.anyListOf;
//import org.json.JSONException;
//import org.hamcrest.CoreMatchers;
import org.junit.Test;
//import org.junit.Before;
//import org.junit.Test;
import org.junit.runner.RunWith;
//import org.mockito.Answers;
import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations.Mock;   //not this
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.samples.petclinic.repository.VisitRepository;
//import org.springframework.mock.web.MockMultipartFile;
//import org.springframework.web.multipart.MultipartFile;
import org.springframework.samples.petclinic.service.ClinicServiceImpl;
//import java.util.List;
//import static java.util.Collections.singleton;
//import static java.util.Collections.singletonList;
//import static java.util.Collections.emptyList;    ///-----

/*//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.any;
//import static org.mockito.Matchers.any;
//import static org.mockito.Matchers.anyListOf;
//import org.json.JSONException;
//import org.hamcrest.CoreMatchers;
import org.junit.Test;
//import org.junit.Before;
//import org.junit.Test;
import org.junit.runner.RunWith;
//import org.mockito.MockitoAnnotations.Mock;   //not this
import org.mockito.Mock;
import org.mockito.Answers;
//import org.mockito.Answers;
//import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
//import org.springframework.mock.web.MockMultipartFile;
//import org.springframework.web.multipart.MultipartFile;
import org.springframework.samples.petclinic.service.ClinicService;
//import java.util.List;
//import static java.util.Collections.singleton;
//import static java.util.Collections.singletonList;
//import static java.util.Collections.emptyList;  
*/

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
	
	/*@Mock(answer = Answers.RETURNS_DEFAULTS)
    ClinicService clinicservice; 
	
	@Test
	public void m1(){
		given(clinicservice.findOwnerById(3)).willReturn(new Owner());
	}
	@Test
	public void m2(){
		when(clinicservice.findOwnerById(3)).thenReturn(new Owner());
	}
	@Test
	public void m3(){
		when(clinicservice.findOwnerById(any(int.class))).thenReturn(new Owner());
		//when(clinicservice.findOwnerById(anyListOf(int.class),any(String.class),any(Owner.class))).thenReturn(new Owner());
		//when(clinicservice.findOwnerById(3).thenReturn(any(Owner.class)));  //not
	}
	@Test
	public void m4(){
		verify(clinicservice).findOwnerById(3);
		verify(clinicservice,times(10)).findOwnerById(3);
	}
	@Test
	public void m5(){
		given(clinicservice.findOwnerById(3)).willReturn(new Owner());
		//when actual call without mock
		// OwnerRepository.findOwnerById(5);
		//then
		//assertTrue();
	}*/
	
	@InjectMocks 
	ClinicServiceImpl clinicservice;
	
	@Mock
	OwnerRepository ownerRepository;
	
	@Mock
	PetRepository petRepository; 
	
	@Mock
	VetRepository vetRepository;
	
	@Mock
	VisitRepository visitRepository; 
	
	
	/*@Before
	public void setup() { 
		ClinicService clinicservice = new ClinicServiceImpl(); 
	}*/
	
	
	@Test
	public void m6(){
		Owner o1 = new Owner(); 
		o1.setFirstName("Vishnu"); 
		when(ownerRepository.findById(3)).thenReturn(o1);
		Owner o = ownerRepository.findById(3); 
		assertEquals(o.getFirstName(),"Vishnu");
	}
	@Test
	public void m7(){
		Owner o1 = new Owner(); 
		o1.setFirstName("Prerna");
		o1.setLastName("Thapar"); 
		given(ownerRepository.findById(5)).willReturn(o1); 
		Owner o2 = clinicservice.findOwnerById(5);
		assertNotNull(o2);
		assertTrue(o2.getFirstName() != null); 
		assertEquals(o2.getLastName().length(), 6); 
	}
	
	@Test
	public void m8() {
		when(vetRepository.findAll()).thenReturn(null);
		Collection<Vet> vets = vetRepository.findAll();
		assertNull(vets); 
		
		
	}
	
	@Test
	public void m9() {
		Collection c = new ArrayList(); 
		Vet v1 = new Vet(); 
		v1.setFirstName("Vishnu");
		Vet v2 = new Vet();
		v2.setFirstName("Prerna"); 
		Vet v3 = new Vet();
		v3.setFirstName("Lee"); 
		c.add(v1); 
		c.add(v2);
		c.add(v3); 
		
		
		
		when(vetRepository.findAll()).thenReturn(c);
		Collection<Vet> vets = vetRepository.findAll();
		List<Vet> l = new ArrayList(vets);
		assertNotNull(vets); 
		assertTrue(l.size() == 3);  
		assertTrue(  l.get(1).getFirstName().equals("Prerna")   ); 
		assertFalse(l.size() == 8); 
		assertEquals(l.size(),3); 
		assertNotEquals(l.get(0).getFirstName(),"Prerna"); 
	}
	
	
	
	
	
}
