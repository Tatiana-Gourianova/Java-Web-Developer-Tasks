package by.tc.task01.dao.impl;

import java.sql.*;


public class ExchangeDB {
    //часть кода по инициализации в DatabaseIn , часть в ExchangeDB

    public static final String DB_URL = "jdbc:h2:E:\\new_doc\\Java\\jwd-task01-template_v2\\db\\exchange";
    public static final String DB_Driver = "org.h2.Driver";

    public void  setExchangeDB(){

        try {
            Class.forName(DB_Driver); //Проверяем наличие JDBC драйвера для работы с БД

            Connection connection = DriverManager.getConnection(DB_URL);//соединениесБД
            System.out.println("Соединение с СУБД выполнено.");
            connection.close();// отключение от БД

            //System.out.println("Отключение от СУБД выполнено.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();// обработка ошибки  Class.forName

            //System.out.println("JDBC драйвер для СУБД не найден!");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибок  DriverManager.getConnection

            //   System.out.println("Ошибка SQL !");
        }
    }
}

//
