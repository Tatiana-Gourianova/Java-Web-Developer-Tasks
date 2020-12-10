package by.epam.task02.electronics.controllers;
import java.util.List;

public class SetDataBase {
        private List<String> ReadenLines;

    public SetDataBase(DataReadFromFile readFromFile) {
        List<String> allLines=readFromFile.ReadFromFile();
        for (java.lang.String line : allLines) {
            System.out.println(line);

        }

    }

/*    public void setReadenLines( DataReadFromFile readFromFile){

        this.ReadenLines=readFromFile.ReadFromFile();

    }
    public  List<String> getReadenLines(){

        return this.ReadenLines;
    }
    
    public void   PrintDataBase(){
        
        for (java.lang.String line : this.ReadenLines) {
            System.out.println(line);

        }
  */
        
    }




