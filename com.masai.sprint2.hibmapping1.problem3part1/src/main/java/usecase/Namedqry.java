package usecase;

import java.util.List;
import connections.EMUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class Namedqry {
public static void main(String[]arrgs) {
	
	EntityManager em= EMUtils.ProvideConnection();
	
	
	Query q= em.createNamedQuery("VegBiryani");
	
	q.setParameter("bal", 1);
	
	List<entity.VegBiryani> list= q.getResultList();
	
	list.forEach(a -> System.out.println(a));
}
}