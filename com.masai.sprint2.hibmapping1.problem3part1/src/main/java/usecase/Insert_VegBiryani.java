package usecase;

import java.util.ArrayList;
import java.util.List;
import connections.EMUtils;
import jakarta.persistence.EntityManager;

public class Insert_VegBiryani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<entity.VegBiryani>vb= new ArrayList<entity.VegBiryani>();
		vb.add(new entity.VegBiryani(1,500," ziy"));
		
		vb.add(new entity.VegBiryani(2,500," ziy"));
		
		vb.add(new entity.VegBiryani(3,500," ziy"));
		
		vb.add(new entity.VegBiryani(4,500," ziy"));
		
		vb.forEach(a-> add(a));
	}
public static void add(entity.VegBiryani v) {
	EntityManager em=EMUtils.ProvideConnection();
	
	em.getTransaction().begin();
	
	em.persist(v);
	
	em.getTransaction().commit();
	
	em.close();
}
}
