package usecase;

import java.util.List;
import connections.EMUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class getChickviryani {

	public static void main(String[] args) {
		
			EntityManager em=EMUtils.ProvideConnection() ;

			String jpql="from ChickenBiryani";

			Query q=em.createQuery(jpql);

			List<entity.ChickenBiryani> list=q.getResultList();
	
			list.forEach(a->System.out.println(a));
	}

}