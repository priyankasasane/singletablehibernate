package com.singletabledemo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name = "worker", discriminatorType = DiscriminatorType.STRING) // SINGLE _TABLE
@DiscriminatorValue("Info") // SINGLE _TABLE

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)

public class Worker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int workerId;
	String workerName;

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(int workerId, String workerName) {
		super();
		this.workerId = workerId;
		this.workerName = workerName;
		System.out.println("*****worker****");

	}

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

}
