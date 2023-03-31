package com.singletabledemo;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("ContractW")		 //SINGLE _TABLE 
public class ContractWorker extends Worker {
	
//	int cID;//  for joinedtable
	@Column(name = "Rs_Hr")
	float pricePerHour;
	@Column(name = "Con_p")
	String contractPeriod;

	public ContractWorker() {
		super();
	}

	public ContractWorker( float pricePerHour, String contractPeriod) {
		super();
		this.pricePerHour = pricePerHour;
		this.contractPeriod = contractPeriod;
		System.out.println("*****contractW****");

	}


//	public ContractWorker(int cID, float pricePerHour, String contractPeriod) {
//	super();
//	this.cID = cID;
//	this.pricePerHour = pricePerHour;
//	this.contractPeriod = contractPeriod;
//}
	
	public float getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(float pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	
}
