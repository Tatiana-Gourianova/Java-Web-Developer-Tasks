package by.tc.task01.service.impl;


import by.tc.task01.dao.impl.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
	@Override
	public Appliance find(Criteria criteria) throws SQLException, ClassNotFoundException {

		Appliance appliance = null;
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		} else {
			ApplianceDAOImpl applianceDAO = new ApplianceDAOImpl();
			appliance = applianceDAO.find(criteria);
		}


/*	public static final Comparator<Appliance> COMPARE_BY_COUNT = new Comparator<Appliance>() {

		@Override
		public int compare(Appliance lA, Appliance rA) {
			return (int) (lA.getId() - rA.getId());
		}


		public int compare(List<String> o1, List<String> o2) {

			//
			return 0;
		}
	};
*/





		ApplianceReader applianceReader = new ApplianceReader();


		String path = "E:\\new_doc\\Java\\jwd-task01-template_v2\\src\\main\\resources";
		String file = "appliances_db.txt";

		ApplianceReader readFromFile = new ApplianceReader(path, file);
	//	SetDataBase A_DB = new SetDataBase(readFromFile); //Дописать заполнение sql таблиц и поиск с помощью sql запросов
		List<String> applianceData = applianceReader.takeAll();


		ApplianceGroupSearchName applianceGroupSearchName = new ApplianceGroupSearchName();
		List<String> findedAppliancesGroup = applianceGroupSearchName.find(applianceData, criteria.getGroupSearchName());

		ApplianceFilter applianceFilter = new ApplianceFilter();

		applianceData = new ApplianceParse().parse(applianceData);


		List<String> filtredApplianceData = applianceFilter.filter(applianceData, criteria.getGroupSearchName());
		ApplianceBuilder applianceBuilder = new ApplianceBuilder();


		applianceBuilder.build(new ApplianceParse().parse(filtredApplianceData), criteria);
		ArrayList<String> foundAppliances = new ArrayList<String>();




		String[] Appliances = findedAppliancesGroup.toArray(new String[findedAppliancesGroup.size()]);
//		System.out.println("found: " + Appliances[applianceBuilder.getApplianceNumberinGroup()]);
		foundAppliances.add(Appliances[applianceBuilder.getApplianceNumberinGroup()]);


		if (Appliances != null) {



			ApplianceCreate applianceCreate=new ApplianceCreate(foundAppliances,criteria.getGroupSearchName());
			appliance=applianceCreate.getAppliance();
		}
		return appliance;
	}
}
