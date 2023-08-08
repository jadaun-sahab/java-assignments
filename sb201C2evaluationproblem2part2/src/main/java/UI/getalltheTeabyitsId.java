package UI;

import java.util.List;

import Connection.EMUtils;
import Models.Tea;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class getalltheTeabyitsId {
	public static void main(String[] args) {
		
		EntityManager em=EMUtils.provideEntityManager() ;

		String jpql="from tea where teaid =:id";

		Query q=em.createQuery(jpql);

		q.setParameter("id", 1);

		List<Tea> list=q.getResultList();

		list.forEach(a->System.out.println(a));
	}
}
