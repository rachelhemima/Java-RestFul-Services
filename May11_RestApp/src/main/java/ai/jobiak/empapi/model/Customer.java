package ai.jobiak.empapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue
	 @Column(name="cusid")
	private Long Id;
	private String name;
	private double balance;
	
	public Customer()
	{
	}
	public String getName() {
		return name;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}






}