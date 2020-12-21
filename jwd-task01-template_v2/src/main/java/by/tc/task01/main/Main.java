package by.tc.task01.main;




import by.tc.task01.dao.impl.ApplianceReader;
import by.tc.task01.dao.impl.SetDataBase;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import by.tc.task01.entity.TabletPC;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.sql.*;




public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {


		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
/*
		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"


		//System.out.println(MySQLQueryGenerator.generateCreateTableQuery(Person.class));
		Appliance appliance;
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 3);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 3);

		/************************************
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 3);
		criteriaOven.add(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), 3);
		criteriaOven.print();
		criteriaOven.delete(SearchCriteria.Oven.CAPACITY.toString(), 3);


		//System.out.println("!"+criteriaOven.find("DEPTH",3)+"!");

		criteriaOven.print();
		/************************************
		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		/////////////////////////////////////////////////////////////////*/

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 40);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60);

		Appliance appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		/////////////////////////////////////////////////////////////////
		//
		/*

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);

		appliance = service.find(criteriaOven);// find(Object...obj)

		PrintApplianceInfo.print(appliance);


		//ApplianceReader R=new ApplianceReader();
		//SetDataBase A=new SetDataBase(R);

		/* ExchangeDB db = new ExchangeDB();
		db.createTablesAndForeignKeys();

		db.setExchangeDB();
		db.Uppend();

		/*
		//System.out.println(MySQLQueryGenerator.generateCreateTableQuery(Oven.class));
		Connection connection =   DriverManager.getConnection(DB_URL);
		//Speakers speakers=new Speakers();
		Statement statement = connection.createStatement();
		db.createTablesAndForeignKeys();
		String    sql="INSERT INTO speakers_table ( PowerConsumption, NumberOfSpeakers, FrequencyRange,CordLength) VALUES (6,7,8,9)";
		int rowsAffected    = statement.executeUpdate(sql);
		sql="INSERT INTO speakers_table ( PowerConsumption, NumberOfSpeakers, FrequencyRange,CordLength) VALUES (2,3,4,5)";
		rowsAffected   = statement.executeUpdate(sql);
		System.out.println(rowsAffected+"!?!!");
		connection.close();
*/
		}



/*		Statement statement = connection.createStatement();
		System.out.println("Создана таблица 2" + statement.getClass().toString());
		String    sql       = "update oven_table set PowerConsumption='123400' ";
		int rowsAffected    = statement.executeUpdate(sql);

		Statement statement = connection.createStatement();
		System.out.println("Создана таблица 2" + statement.getClass().toString());

		String    sql="INSERT INTO oven_table ( PowerConsumption, Weight,Capacity,Depth,Height,Width) VALUES (4, 5, 6,7,8,9)";
		//     = "update oven_table set PowerConsumption='123400' ";
		int rowsAffected    = statement.executeUpdate(sql);
            /* BIGINT AUTO_INCREMENT PRIMARY KEY," +
            "PowerConsumption SMALLINT NOT NULL," +
                    "Weight REAL NOT NULL,"+
                    "Capacity REAL NOT NULL,"+
                    "Depth REAL NOT NULL," +
                    "Height REAL NOT NULL," +
                    "Width REAL NOT NULL"

		System.out.println(rowsAffected+"!!!");
*/


	}

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
		 System.out.println(tabletPC.hashCode());

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


		 Appliance oven2=new Oven(Integer.valueOf((String)A), Float.valueOf((String)v),
		 Float.valueOf((String)v2), Float.valueOf((String)v3), Float.valueOf((String)v4), Float.valueOf((String)v6));
		 //////////////////////////////////////////////////////////////////
		 oven2.setId(1231234);
		 System.out.println(oven2.getId());

		 ExchangeDB db = new ExchangeDB();
		 //db.createTablesAndForeignKeys();

		 db.setExchangeDB();
		 //System.out.println(MySQLQueryGenerator.generateCreateTableQuery(Oven.class));
	}
*/


