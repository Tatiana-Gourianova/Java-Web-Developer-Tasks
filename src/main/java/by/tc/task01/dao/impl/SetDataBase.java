package by.tc.task01.dao.impl;

import java.util.List;


    public class SetDataBase {
        private List<String> ReadenLines;

        public SetDataBase(ReadDataFromFile readFromFile) {


            List<String> allLines = readFromFile.ReadFromFile();
            for (java.lang.String line : allLines) {
                //System.out.println(line);





            }

        }

    }


