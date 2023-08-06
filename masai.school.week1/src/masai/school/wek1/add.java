package masai.school.wek1;
import java.util.*;
public class add {
public static void main(String[] args) {
	
//	HashMap<Integer, String> map= new HashMap<>();
//	map.put(3,"sri");
//	map.put(1,"raji");
//	map.put(2,"vikas");
//	map.put(0,"himu");
//	map.put(4,"jadaun");
//	for(int i=0;i<map.size();i++) {
//		System.out.println(map.get(i));
//	}

	ArrayList<Integer> list = new ArrayList<>();
	list.add(5);
	list.add(80);
	list.add(9);
	list.add(4);
	list.add(2);
	int max=list.get(0);
	
	Collections.sort(list);
	System.out.print(list);
	
//	HashSet<Integer> set= new HashSet<>();
//	set.add(5);
//	set.add(4);
//	set.add(5);
//	set.add(4);
//	set.add(5);
//	set.add(4);
//	for(int i=1;i<=set.size();i++) {
//		System.out.println(set);
//	}
	
	}
}
