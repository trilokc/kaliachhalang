package org.springframework.samples.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column; 
import org.hibernate.validator.constraints.NotEmpty;




@Entity 
@Table(name = " Jhupdhi")
public class House extends BaseEntity {

	
	@Column(name = "address")
	@NotEmpty
	private String adress;
	
	
	@Column(name = "zp")
	private String zipcode; 
	
	@Column(name = "bedrooms")
	private int no_bedrooms; 
	
	@Column()
	private double sft; 
	private double price;
	
	@ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public int getNo_bedrooms() {
		return no_bedrooms;
	}
	public void setNo_bedrooms(int no_bedrooms) {
		this.no_bedrooms = no_bedrooms;
	}
	public double getSft() {
		return sft;
	}
	public void setSft(double sft) {
		this.sft = sft;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	
	
  
}
