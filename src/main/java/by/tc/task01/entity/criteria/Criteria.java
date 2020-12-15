package by.tc.task01.entity.criteria;

import by.tc.task01.entity.Appliance;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);


	}

	public void delete(String searchCriteria, Object value) {
		criteria.remove(searchCriteria, value);
	}

	public boolean equal(String searchCriteria, Object value) {
		return criteria.equals(searchCriteria);
	}

//	public String find (SearchCriteria searchCriteria ) {

		public String find (String searchCriteria, int value ) {

		String mapEntryWithID = null;

		if (criteria.containsKey(searchCriteria)) {

			for (Map.Entry entry : criteria.entrySet()) {
				if ((entry.getKey() == searchCriteria)&&criteria.containsValue(value)) mapEntryWithID = entry.toString();
			}
		}
		return mapEntryWithID;
	}

	public void print() {
		for (Map.Entry entry : criteria.entrySet()) {
			System.out.print(entry);
		}
		System.out.print("\n");
	}


}

