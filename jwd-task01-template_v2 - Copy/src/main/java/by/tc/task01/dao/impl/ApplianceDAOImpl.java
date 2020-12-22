package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.ApplianceFactory;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ApplianceDAOImpl implements ApplianceDAO {



	@Override
	public Appliance find(Criteria criteria) {
		Appliance result = null;

/*
		File file = new File("src\\main\\resources\\appliances_db.txt");

		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] colums = null;

				if (!line.isEmpty())
					colums = line.split(" : ");

				if (colums[0].compareTo(criteria.getGroupSearchName()) != 0) {
					continue;
				}

				HashMap<String, String> searchMap = new HashMap<String, String>();

				String[] params = colums[1].split(", ");

				for (int i = 0; i < params.length; i++) {
					String paramsValues[] = params[i].split("=");

					for (int j = 0; j < paramsValues.length; j += 2) {
						searchMap.put(paramsValues[j], paramsValues[j + 1]);
					}
				}

				boolean found = true;

				for (HashMap.Entry<String, Object> criteriaEntry : criteria.getCritaria().entrySet()) {
					if (!(searchMap.containsKey(criteriaEntry.getKey()) && searchMap.get(criteriaEntry.getKey()).equals(criteriaEntry.getValue())))
						found = false;

				}

				if (found) {
					ApplianceFactory applianceFactory = new ApplianceFactory();
					ArrayList<String> parameters = new ArrayList<String>();

					for (int i = 0; i < params.length; i++) {
						String paramsValues[] = params[i].split("=");

						for (int j = 1; j < paramsValues.length; j += 2) {
							parameters.add(paramsValues[j]);
						}
					}

					result = applianceFactory.create(criteria.getGroupSearchName(), parameters);
					return result;
				}
			}
		} catch (Exception ex) {
			ex.getMessage();
		}
*/
		return result;
	}
}