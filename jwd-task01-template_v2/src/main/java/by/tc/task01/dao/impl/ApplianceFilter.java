package by.tc.task01.dao.impl;

import java.util.*;

public class ApplianceFilter {

    public List<String> filter(List<String> applianceData, String groupSearchName) {
        ArrayList<String> filteredAppilianceData = new ArrayList<>();
String st=groupSearchName;//correct!!!


        groupSearchName = (new StringBuilder(st)).insert(1, "=").toString()+" }";
       // System.out.println(groupSearchName);
        boolean stop=false;
        for (int i=0; i<applianceData.toArray().length;i++) {
            //System.out.println(applianceData.toArray()[i]);
            String[] words = applianceData.toArray()[i].toString().split(",");
            for (String word : words) {
                        if (word.trim().equalsIgnoreCase(groupSearchName)) {
                       // System.out.println(word);
                        for (int j=0;j<words.length;j++)
                        filteredAppilianceData.add(words[j]);


                }
                    //filteredAppilianceData.add(word);}
                //System.out.println(Arrays.stream(words).toArray());
                }

            }


//System.out.println(filteredAppilianceData);
        return filteredAppilianceData;
    }
}
