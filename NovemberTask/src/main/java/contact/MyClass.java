package contact;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MyClass implements MyInterface {

	public List<String> hello(String Name, String name2, String name3) {
		Name name = new Name();
		name.setFirstName("venakt");
		name.setLastName("abc");
		name.setCity("iowa");
		List<String> list = new ArrayList<String>();
		list.add(name.getFirstName());
		list.add(name.getLastName());
		list.add(name.getCity());

		return list;

	}

}
