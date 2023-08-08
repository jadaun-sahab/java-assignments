package UI;

import java.util.List;

import Connection.EMUtils;
import Models.Tea;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class getalltheTeawhosepriceislessthan100 {
public static void main(String[] args) {
		
		EntityManager em=EMUtils.provideEntityManager() ;

		String jpql="from tea where price <100";

		Query q=em.createQuery(jpql);

		List<Tea> list=q.getResultList();

		list.forEach(a->System.out.println(a));
	}
}
