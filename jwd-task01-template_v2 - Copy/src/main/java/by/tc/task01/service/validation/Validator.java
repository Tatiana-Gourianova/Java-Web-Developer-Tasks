package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {

		boolean isValid=true;
		if ((criteria.getGroupSearchName()==null)&&(criteria.getCritaria()==null))
			isValid=false;

		return isValid;
	}

}


