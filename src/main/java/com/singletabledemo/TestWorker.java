package com.singletabledemo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestWorker {

public static void main(String[] args) {
	
	System.out.println("*****************start*******************");
	
	Worker w1= new Worker(1, "priti");
	Worker w2= new Worker(2, "riya");
	PermWorker p1= new PermWorker(20000, 400);  //for SINGLE_TABLE
	PermWorker p2= new PermWorker(32000, 200);
	ContractWorker c1= new ContractWorker(400, "12 hours" );
	ContractWorker c2= new ContractWorker(500, "28 hours" );
//	PermWorker p1= new PermWorker(1,20000, 400);//for joined table
//	PermWorker p2= new PermWorker(2,32000, 200);
//	ContractWorker c1= new ContractWorker(1,400, "12 hours" );
//	ContractWorker c2= new ContractWorker(2,500, "28 hours" );
	
	
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session session= factory.openSession();
	Transaction tx= session.beginTransaction();
	
	session.save(w1);
	session.save(w2);
	session.save(p1);
	session.save(p2);
	session.save(c1);
	session.save(c2);
	tx.commit();
	session.close();
	
	
	System.out.println("*********************end***********************");
	
	
}

}
