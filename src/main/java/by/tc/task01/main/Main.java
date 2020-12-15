package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.dao.impl.ReadDataFromFile;
import by.tc.task01.dao.impl.SetDataBase;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"

		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 3);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 3);

		/************************************/
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 3);
		criteriaOven.add(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), 3);
		 criteriaOven.print();
		criteriaOven.delete(SearchCriteria.Oven.CAPACITY.toString(), 3);



		System.out.println("!"+criteriaOven.find("DEPTH",3)+"!");

		criteriaOven.print();
		/************************************/
		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
		 criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
		 criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);

		appliance = service.find(criteriaOven);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

		ExchangeDB db = new ExchangeDB();
		db.setExchangeDB();
		System.out.println("DRGFDFG");
		/***

		String path = "E:\\new_doc\\Java\\JavaWebDeveloper\\ElectronicsFactory\\src\\by\\epam\\task02\\electronics\\controllers\\";
		 String file="appliances_db.txt";

		ReadDataFromFile readFromFile=new ReadDataFromFile(path,file);
		SetDataBase A =new SetDataBase(readFromFile);

/***************************
		String A="2";
		String v="3";
		String v2="3";
		String v3="3";
		String v4="3";
		String v5="3";
		String v6="32";

		Appliance tabletPC=new TabletPC(Integer.valueOf((String)A),Integer.valueOf((String)v),
				Integer.valueOf((String)v2),Integer.valueOf((String)v3),v5);

		Appliance tabletPC2=new TabletPC(Integer.valueOf((String)A),Integer.valueOf((String)v),
				Integer.valueOf((String)v2),Integer.valueOf((String)v3),v5);

		Appliance re =new VacuumCleaner(Integer.valueOf((String)A),v,v2,v3,Integer.valueOf((String)v4),Integer.valueOf((String)v5));

		Appliance re2 =new VacuumCleaner(Integer.valueOf((String)A),v,v2,v3,Integer.valueOf((String)v4),Integer.valueOf((String)v5));

//		Appliance re2 =new VacuumCleaner(Integer.valueOf((String)A),Float.valueOf((String)v),
//				Integer.valueOf((String)v2),Integer.valueOf((String)v3), Integer.valueOf((String)v5));

		Appliance sp=new Speakers(Integer.valueOf((String)A), Integer.valueOf((String)v),
				v4, Float.valueOf((String)v5));

		Appliance sp2=new Speakers(Integer.valueOf((String)A), Integer.valueOf((String)v),
				v4, Float.valueOf((String)v5));

		Appliance oven2=new Oven(Integer.valueOf((String)A), Float.valueOf((String)v),
				Float.valueOf((String)v2), Float.valueOf((String)v3), Float.valueOf((String)v4), Float.valueOf((String)v6));

		PrintApplianceInfo.print(tabletPC);
		PrintApplianceInfo.print(oven2);
		Oven oven = new Oven(Integer.valueOf((String)A), Float.valueOf((String)v),
				Float.valueOf((String)v2), Float.valueOf((String)v3), Float.valueOf((String)v4), Float.valueOf((String)v5));

		System.out.println(sp.equals(sp2));
		//equals(oven2.toString(),oven1.toString()));
		System.out.println(sp.hashCode());
		System.out.println(re.hashCode());
		System.out.println(oven2.hashCode());
		System.out.println(tabletPC.hashCode());
		PrintApplianceInfo.print(sp2);

*/

	}

}
