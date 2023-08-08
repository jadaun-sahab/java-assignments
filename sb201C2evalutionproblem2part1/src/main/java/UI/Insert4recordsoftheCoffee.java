package UI;

import java.util.ArrayList;
import java.util.List;

import Connection.EMUtils;
import Models.Coffee;
import jakarta.persistence.EntityManager;

public class Insert4recordsoftheCoffee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Coffee>vb= new ArrayList<Coffee>();
		vb.add(new Coffee(1,280," late", "nestle"));
		
		vb.add(new Coffee(2,400," mocha", "nestle"));
		
		vb.add(new Coffee(3,200," cape", "nestle"));
		
		vb.add(new Coffee(4,300," french", "nestle"));
		
		vb.forEach(a-> add(a));
	}
public static void add(Coffee v) {
	EntityManager em=EMUtils.provideEntityManager();
	
	em.getTransaction().begin();
	
	em.persist(v);
	
	em.getTransaction().commit();
	
	em.close();
}
}
