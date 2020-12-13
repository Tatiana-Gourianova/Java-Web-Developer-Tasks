package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.AppliancesType;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;
/*
		//*****************************
		Integer paramsAmount=3;
		Appliance appliance1=new Appliance(ApppliancesType.LAPTOP,paramsAmount);
 appliance1.AppliancePrint();
		Integer a=3;
		//String v=2.6;
		String A="2";
		String v="3";
		String v2="3";
		String v3="3";
		String v4="3";
		String v5="3";



		//v,v2,v3,v4,v5);
//********************************

 */
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
	////???	criteriaOven.add(Oven.CAPACITY.toString(), 3);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
	////????	criteriaOven.add(Oven.HEIGHT.toString(), 200);
		////???? criteriaOven.add(Oven.DEPTH.toString(), 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);

		appliance = service.find(criteriaOven);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

/***************************/
		String A="2";
		String v="3";
		String v2="3";
		String v3="3";
		String v4="3";
		String v5="3";
		String v6="32";

		Appliance laptop=new Laptop(Float.valueOf((String)A),Integer.valueOf((String)v),
				Integer.valueOf((String)v2),Integer.valueOf((String)v3),Float.valueOf((String)v4), Integer.valueOf((String)v5));


		Appliance oven1=new Oven(Integer.valueOf((String)A), Float.valueOf((String)v),
				Float.valueOf((String)v2), Float.valueOf((String)v3), Float.valueOf((String)v4), Float.valueOf((String)v5));
		Appliance oven2=new Oven(Integer.valueOf((String)A), Float.valueOf((String)v),
				Float.valueOf((String)v2), Float.valueOf((String)v3), Float.valueOf((String)v4), Float.valueOf((String)v6));

		PrintApplianceInfo.print(oven1);
		PrintApplianceInfo.print(oven2);
		Oven oven = new Oven(Integer.valueOf((String)A), Float.valueOf((String)v),
				Float.valueOf((String)v2), Float.valueOf((String)v3), Float.valueOf((String)v4), Float.valueOf((String)v5));

		System.out.println(oven.Equals(oven1));
		//equals(oven2.toString(),oven1.toString()));
		System.out.println(oven.hashCode());
		System.out.println(oven1.hashCode());
		System.out.println(oven2.hashCode());
		System.out.println(laptop.hashCode());
		PrintApplianceInfo.print(laptop);



	}

}
