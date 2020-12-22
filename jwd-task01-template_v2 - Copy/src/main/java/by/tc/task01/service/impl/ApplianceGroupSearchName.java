package by.tc.task01.service.impl;

import java.util.*;
import java.util.stream.Collectors;

public class ApplianceGroupSearchName {
    private List<String> applianceDataGroupSearchName;

    public ApplianceGroupSearchName() {

    }

    public void setApplianceDataGroupSearchName(List<String> applianceData) {
        this.applianceDataGroupSearchName = applianceData;
    }

    public List<String> getApplianceDataGroupSearchName() {
        return applianceDataGroupSearchName;
    }


    public List<String> find(List<String> applianceData, String groupSearchName) {
        ArrayList<String> filterdAppilianceData = new ArrayList<String>();
        Map<String, String> map = new HashMap<String, String>();
        for (java.lang.String line : applianceData) {

            map = Arrays.stream(line.split("\\|", -1))
                    .map(s -> s.split("", 2))
                    .collect(Collectors.toMap(a -> a[0], a -> a.length > 1 ? a[1] : ""));

            if (line.toString().contains(groupSearchName)) {

                filterdAppilianceData.add(line.toString());

            }
        }


        return filterdAppilianceData;
//        ArrayList<String> filterdBYgroupSearchNameApplianses = new ArrayList<>();

        //if (allLines[0].split("\\|", -1).length)


        //return allLines;}
    }
}