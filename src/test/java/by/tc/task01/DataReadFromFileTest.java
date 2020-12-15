package by.tc.task01;
import by.tc.task01.dao.impl.ReadDataFromFile;
import by.tc.task01.dao.impl.SetDataBase;
//import org.junit.jupiter.api.Test;

import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;

public class DataReadFromFileTest {

        private final static String path = "E:\\new_doc\\Java\\JavaWebDeveloper\\ElectronicsFactory\\src\\by\\epam\\task02\\electronics\\controllers\\";
        private final static String file="appliances_db.txt";

        ReadDataFromFile readFromFile=new ReadDataFromFile(path,file);
        SetDataBase A =new SetDataBase(readFromFile);


   }

