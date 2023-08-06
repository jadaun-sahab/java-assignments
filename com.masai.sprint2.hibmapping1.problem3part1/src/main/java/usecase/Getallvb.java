package usecase;

import java.util.List;
import connections.EMUtils;
import entity.VegBiryani;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class Getallvb {

	
	public static void main(String[] args) {

		EntityManager em=EMUtils.ProvideConnection() ;
		String jpql="from tea";

		Query q=em.createQuery(jpql);
		List<VegBiryani> list=q.getResultList();

		list.forEach(a->System.out.println(a));
	}

}