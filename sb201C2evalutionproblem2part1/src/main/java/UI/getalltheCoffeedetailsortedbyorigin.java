package UI;

import java.util.List;

import Connection.EMUtils;
import Models.Coffee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class getalltheCoffeedetailsortedbyorigin {
	public static void main(String[] args) {

		EntityManager em=EMUtils.provideEntityManager() ;
		String jpql="from Coffee";

		Query q=em.createQuery(jpql);
		List<Coffee> list=q.getResultList();

		list.forEach(a->System.out.println(a));
	}
}
