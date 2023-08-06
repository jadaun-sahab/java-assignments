package usecase;

import java.util.List;
import connections.EMUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class getChickviryaniByid {

	public static void main(String[] args) {
	
		EntityManager em=EMUtils.ProvideConnection() ;

		String jpql="from ChickenBiryani where ChickenBiryaniId =:id";

		Query q=em.createQuery(jpql);

		q.setParameter("id", 1);

		List<entity.ChickenBiryani> list=q.getResultList();

		list.forEach(a->System.out.println(a));
	}

}