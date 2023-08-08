package UI;

import java.util.List;
import Models.Coffee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class Namedqry {
public static void main(String[]arrgs) {
	
	EntityManager em= Connection.EMUtils.provideEntityManager();
	
	
	Query q= em.createNamedQuery("Coffee");
	
	q.setParameter("bal", 1);
	
	List<Coffee> list= q.getResultList();
	
	list.forEach(a -> System.out.println(a));
}
}