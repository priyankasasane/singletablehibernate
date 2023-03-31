package com.singletabledemo;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("PermenantW")		//for SINGLE_TABLE
public class PermWorker extends Worker {

//	int pID; //  for joinedtable
	@Column(name = "sal")
	float salary;
	@Column(name="extra")
	int additionalBenefits;

	public PermWorker() {
		super();
	}
	
	public PermWorker(float salary, int additionalBenefits) {
		super();
		this.salary = salary;
		this.additionalBenefits = additionalBenefits;
		System.out.println("*****permW****");

	}

//	public PermWorker(int pID, float salary, int additionalBenefits) {
//		super();
//		this.pID = pID;
//		this.salary = salary;
//		this.additionalBenefits = additionalBenefits;
//	}


	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAdditionalBenefits() {
		return additionalBenefits;
	}

	public void setAdditionalBenefits(int additionalBenefits) {
		this.additionalBenefits = additionalBenefits;
	}

	

}
