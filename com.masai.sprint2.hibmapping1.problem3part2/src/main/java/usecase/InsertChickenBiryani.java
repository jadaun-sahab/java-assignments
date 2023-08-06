package usecase;

import java.util.ArrayList;
import java.util.List;
import connections.EMUtils;
import jakarta.persistence.EntityManager;

public class InsertChickenBiryani {

	public static void main(String[] args) {
		List< entity.ChickenBiryani>vb= new ArrayList<>();
		vb.add(new entity.ChickenBiryani(1,200," ziy"));
		
		vb.add(new entity.ChickenBiryani(2,200," ziy"));
		
		vb.add(new entity.ChickenBiryani(3,500," ziy"));
		
		vb.add(new entity.ChickenBiryani(4,500," ziy"));
		vb.forEach(a-> add(a));
	}
	public static void add(entity.ChickenBiryani v) {
		
		EntityManager em=EMUtils.ProvideConnection();
		
		em.getTransaction().begin();
		
		em.persist(v);
		
		em.getTransaction().commit();
		
		em.close();
	}
}