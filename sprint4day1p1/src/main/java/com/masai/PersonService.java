package com.masai;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	private Map<Person, Skills> skillMap;
	
	private List<Person> personList;
	
	
	 
	public void printSkillMap(){
		for (Entry<Person, Skills> entry : skillMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	public void printPersonList(){
		personList.sort(((o1, o2) -> {
    		if (o1.getId()<o2.getId()) {
				return o2.getId();
			}
    		else if (o1.getId()>o2.getId()) {
				return o1.getId();
			}
    		else {
				return o1.getAge()-o2.getAge();
			}
    	}));
    	
		personList.forEach(personService->System.out.println(personService));
	}
}
