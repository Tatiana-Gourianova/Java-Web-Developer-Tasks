package by.tc.task01.service.impl;

import by.tc.task01.dao.impl.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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

			//List<Appliance> appliances = applianceBuilder.build(new ApplianceParse().parse(filtredApplianceData));

			//есть уже отфильтрованные по groupSearchName list string , который отправляем в билдер,
			// чтобы построить апиленс стринг с теми данными, которые соотв поисковому а
			// запросу. если формировать классы внутри билдера, то проблема с типизации полей
			//поэтому лучше возвратить hashMap и пройтись по н

			/*try {
				Criteria criteria1= (Criteria) criteria.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
*/
			List<Appliance> appliances = applianceBuilder.build(new ApplianceParse().parse(filtredApplianceData,criteria.getGroupSearchName()),criteria);

			System.out.println(".kl.k"+criteria.getGroupSearchName());





				}
	return appliance;
		}
}

/*
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		else {
			ApplianceReader applianceReader=new ApplianceReader();


			String path = "E:\\new_doc\\Java\\JavaWebDeveloper\\ElectronicsFactory\\src\\by\\epam\\task02\\electronics\\controllers\\";
			String file="appliances_db.txt";

			ApplianceReader  readFromFile=new ApplianceReader(path,file);
			SetDataBase A_DB =new SetDataBase(readFromFile);
			List<String> applianceData=applianceReader.takeAll();

			///	List<String> applianceData=A_DB.GetDataBase();
			for (java.lang.String line : applianceData) {
				System.out.println(line+"!@!@!");
			}
			ApplianceFilter applianceFilter = new ApplianceFilter();
			List<String> filtredApplianceData = applianceFilter.filter();
			ApplianceBuilder applianceBuilder=new ApplianceBuilder();
			List<Appliance>appliances=applianceBuilder.build(new ApplianceParse().parse(filtredApplianceData));




			return appliances;

		}
/*		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance>appliances = applianceDAO.search(criteria);

		// you may add your own code here

		return appliances;*/


//		return null;}
//	}
//you may add your own new classes
