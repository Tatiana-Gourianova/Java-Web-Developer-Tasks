package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.util.List;

public class ApplianceBuilder {

    public List<Appliance> ApplianceBuilder() {

        return null;
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-')
                    || (!Character.isDigit(c) && c != '-')
                    || (chars.length == 1 && c == '-')) {
                return false;
            }
        }
        return true;

    }


    public static int[] build(List<String> parsedFiltredApplianceData, Criteria criteria) {

        String[] words;

        String[] s2;
        String st2;

        int[] index = new int[10];
        int count = 0;

        int amountOfCriterias = criteria.getCritaria().values().toArray().length;

        int countApplianceElements = -2;


        for (int j = 0; j < parsedFiltredApplianceData.toArray().length; j++) {

            words = parsedFiltredApplianceData.toArray()[j].toString().split(",");


            for (int k = 0; k < words.length; k++) {

                String st = words[k].replace("= =", " =");
                s2 = st.split("=");//`//("(?<== )(\\f+)(?<=})");
                String criteriaGroupName=s2[1].toString() +s2[2].replace(" }}","");

                if (criteriaGroupName.equals(criteria.getCritariagroupSearchName()))
                    amountOfCriterias = criteria.getCritaria().values().toArray().length;

                st2 = s2[2].replace("}", "");


                if (isNumber(st2)) {

                    if (criteria.find(s2[1], st2)) {
                        //index.add((Integer) j);//сохраняем индексы тех элементов, которые совпадают с критерием поиска
                        // делаем проверку, относятся ли критерии к одному и тому же элементу
                        //
                        //
                        amountOfCriterias--;
                        if (amountOfCriterias <= 0) {
                            index[count] = j;
                            count++;
                            amountOfCriterias = criteria.getCritaria().values().toArray().length;
                        }



                    }
                }
                else {//считаем количество единиц товара в номенклатуре определенного типа
                  countApplianceElements++;
                }
            }}

// В index[] находятся порядковые номера свойств, которые удовлетворяют критерию поиска


        int sections = parsedFiltredApplianceData.toArray().length / countApplianceElements;

        for (int i = 0; i < count; i++) {
            int l = index[i];
            index[i] = l/sections;

                }


        return index;
    }
}

