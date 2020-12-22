package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceFactory;
import by.tc.task01.entity.Appliance;
import java.util.ArrayList;


public class ApplianceCreate {
    private Appliance appliance;

    public   Appliance getAppliance(){       return appliance;    }
    public void setAppliance(Appliance appliance){   this.appliance=appliance;    }

    public  ApplianceCreate(ArrayList<String> appliancesAttributes, String groupSearchName) {


        Appliance result = null;
        String[] params = appliancesAttributes.toArray()[0].toString().split(", ");
        ApplianceFactory applianceFactory = new ApplianceFactory();
            ArrayList<String> parameters = new ArrayList<String>();
        String[] paramsValues;
            for (int i = 0; i < params.length; i++) {

                paramsValues = params[i].split("=");
                if (i==params.length-1) {
                    paramsValues[1]=paramsValues[1].toString().replace(";","");

                }
                    parameters.add(paramsValues[1]);
                }


            result = applianceFactory.create(groupSearchName, parameters);

            this.setAppliance(result);
        }

        }
