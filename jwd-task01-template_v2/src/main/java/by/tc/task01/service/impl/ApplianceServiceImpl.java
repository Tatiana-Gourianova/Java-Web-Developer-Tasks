package by.tc.task01.service.impl;

import by.tc.task01.dao.impl.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{


	@Override
	public Appliance find (Criteria criteria)throws SQLException, ClassNotFoundException {

		Appliance appliance=null;
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		} else {

			ApplianceReader applianceReader = new ApplianceReader();


			String path = "E:\\new_doc\\Java\\JavaWebDeveloper\\ElectronicsFactory\\src\\by\\epam\\task02\\electronics\\controllers\\";
			String file = "appliances_db.txt";

			ApplianceReader readFromFile = new ApplianceReader(path, file);
			SetDataBase A_DB = new SetDataBase(readFromFile);
			List<String> applianceData = applianceReader.takeAll();

			applianceData=new ApplianceParse().parse(applianceData);


			ApplianceFilter applianceFilter = new ApplianceFilter();
			List<String> filtredApplianceData = applianceFilter.filter(applianceData, criteria.getGroupSearchName());
			ApplianceBuilder applianceBuilder = new ApplianceBuilder();




			int[] index=applianceBuilder.build(new ApplianceParse().parse(filtredApplianceData,criteria.getGroupSearchName()),criteria);

			ArrayList<String> foundAppliance = new ArrayList<String>();

			String[] Appliances = applianceData.toArray(new String[filtredApplianceData.size()]);

			for (int i=0;i<index.length;i++) {
				if (index[i]!=0) {
				System.out.println("found "+Appliances[index[i]]);
				foundAppliance.add(Appliances[index[i]]);
			}
}




				}
	return appliance;
		}
}
